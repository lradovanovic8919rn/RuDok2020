package gui.tree.view;

import java.util.List;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

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
		treeModel=new DefaultTreeModel(root);
		treeView=new TreeView(treeModel);
		return treeView;
        
	}

	@Override
	public void addProject(Project project) {
		RafNode nodeModel = ((TreeItem)treeModel.getRoot()).getRafNodeModel();
        ((TreeItem)treeModel.getRoot()).add(new TreeItem(project));
        ((Workspace) nodeModel).addChild(project);
        SwingUtilities.updateComponentTreeUI(treeView);

	}

	@Override
	public void addDocument(Document document) {
		
        
	}
		

	@Override
	public void addPage(Page page) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSlot(Slot slot) {
		// TODO Auto-generated method stub
		
	}

	//Fali implemetacija za getselected path - TreeView.Getlastselectedcompnent
	//Onda radim .getModel , ne zelim samo tree item

}
