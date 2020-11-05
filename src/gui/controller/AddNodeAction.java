package gui.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.jar.Manifest;

import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;


import gui.rightPanelView.ProjectView;
import gui.tree.model.TreeItem;
import gui.view.MainView;
import repository.Document;
import repository.Page;
import repository.Project;
import repository.Slot;
import repository.Workspace;
import repository.node.RafNode;

public class AddNodeAction extends AbstractActionClass{

		static private int i = 0;
		static private int j=0;
		static private int x =0 ;
		static private int  y= 0;

	 public AddNodeAction() {
	        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
	                KeyEvent.VK_F1, ActionEvent.ALT_MASK));
	        putValue(SMALL_ICON, loadIcon("images/add.png"));
	        putValue(NAME, "Add Node");
	        putValue(SHORT_DESCRIPTION, "Add Node");
	    }
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		RafNode node=MainView.getInstance().getTree().getSelectedNode();
		
		if(node!=null) {

		if(node instanceof Workspace) {
		     Project p = new Project("Project " + i++, node);
		     MainView.getInstance().getTree().addProject(p);
			 //MainView.getInstance().getTree().addDocument(d,o);
			 System.out.println("Kreira project");
			 MainView.getInstance().projectViewMaker(p);
			 SwingUtilities.updateComponentTreeUI(MainView.getInstance().getWorkspaceTree());
		}
		if(node instanceof Project) {
		     Document d = new Document("Document " + j++, node);
		     MainView.getInstance().getTree().addDocument(d);
		     System.out.println("Ulazi u doc cre8");
		    // RafNode proc = tr.getRafNodeModel();
		    // proc.notifyListeners(ActionEnum.ACTION_ADD);
			 SwingUtilities.updateComponentTreeUI(MainView.getInstance().getWorkspaceTree());
		    // MainView.getInstance().getSplitPane().getRightComponent().
		     //MainView.getInstance().projectViewMaker((Project) tr.getRafNodeModel());
		}
		if(node instanceof Document) {
			Page p=new Page("Page " + x++ , node);
					//((TreeItem) o).getRafNodeModel());
			MainView.getInstance().getTree().addPage(p);

			SwingUtilities.updateComponentTreeUI(MainView.getInstance().getWorkspaceTree());

		}
		if(node instanceof Page) {
			Slot s=new Slot("Slot "+ y++,node);
		    MainView.getInstance().getTree().addSlot(s);

		}
		if(node instanceof Slot) {
			//Error handler,slot ne moze imati child node
		}
		
		}
		
	}

}
