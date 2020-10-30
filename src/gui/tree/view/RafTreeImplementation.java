package gui.tree.view;

import java.util.List;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeModel;

import gui.tree.RafTree;
import gui.tree.model.TreeItem;
import gui.view.MainView;
import repository.Document;
import repository.Page;
import repository.Project;
import repository.Slot;
import repository.Workspace;
import repository.node.RafNode;

public class RafTreeImplementation implements RafTree {
	
	private TreeView treeView;
    private DefaultTreeModel treeModel;

	@Override
	public JTree generateTree(Workspace workspace) {
		TreeItem root=new TreeItem(workspace);
		root.setName("Workspace");
		treeModel=new DefaultTreeModel(root);
		treeView=new TreeView(treeModel);
		return treeView;
        
	}

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDocument(Document document) {
		// TODO Auto-generated method stub
	}
		

	@Override
	public void addPage(Page page) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSlot(Slot slot) {
		// TODO Auto-generated method stub
		
	}

}
