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
	
		Object o=MainView.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
		TreeItem tr=(TreeItem) o;
		
		if(tr.getRafNodeModel() instanceof Workspace) {
			 int label = new Random().nextInt(1000);
		     Project p = new Project("Project " + i++, (RafNode) ((TreeItem) MainView.getInstance().getWorkspaceTree().getModel().getRoot()).getRafNodeModel());
		     MainView.getInstance().getTree().addProject(p);
			 //MainView.getInstance().getTree().addDocument(d,o);
			 MainView.getInstance().projectViewMaker(p);
		}
		if(tr.getRafNodeModel() instanceof Project) {
			 int label = new Random().nextInt(1000);
		     Document d = new Document("Document " + j++, ((TreeItem) o).getRafNodeModel());
		     MainView.getInstance().getTree().addDocument(d,o);
		     //MainView.getInstance().projectViewMaker((Project) tr.getRafNodeModel());
		}
		if(tr.getRafNodeModel() instanceof Document) {
			int label = new Random().nextInt(1000);
			Page p=new Page("Page " + x++ ,((TreeItem) o).getRafNodeModel());
		     MainView.getInstance().getTree().addPage(p,o);

		}
		if(tr.getRafNodeModel() instanceof Page) {
			int label = new Random().nextInt(1000);
			Slot s=new Slot("Slot "+ y++,((TreeItem) o).getRafNodeModel());
		    MainView.getInstance().getTree().addSlot(s, o);
		}
	}

}
