package gui.tree.view;

import java.util.List;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

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
	public void addDocument(Document document,Object o) {
		int index=treeModel.getIndexOfChild(treeModel.getRoot(), o);
		RafNode nodeModel = ((TreeItem)treeModel.getChild(treeModel.getRoot(), index)).getRafNodeModel();
        ((TreeItem)treeModel.getChild(treeModel.getRoot(), index)).add(new TreeItem(document));
        ((Project) nodeModel).addChild(document);
        SwingUtilities.updateComponentTreeUI(treeView);
	}
		

	@Override
	public void addPage(Page page, Object o) {
		int index=treeModel.getIndexOfChild(((TreeItem)o).getParent(), o);		
		RafNode nodeModel = ((TreeItem)treeModel.getChild(((TreeItem)o).getParent(), index)).getRafNodeModel();
		((TreeItem)treeModel.getChild(((TreeItem)o).getParent(), index)).add(new TreeItem(page));
        ((Document) nodeModel).addChild(page);
        SwingUtilities.updateComponentTreeUI(treeView);

	}

	@Override
	public void addSlot(Slot slot, Object o) {
		int index=treeModel.getIndexOfChild(((TreeItem)o).getParent(), o);		
		RafNode nodeModel = ((TreeItem)treeModel.getChild(((TreeItem)o).getParent(), index)).getRafNodeModel();
		((TreeItem)treeModel.getChild(((TreeItem)o).getParent(), index)).add(new TreeItem(slot) );
        ((Page) nodeModel).addChild(slot);
        System.out.println(nodeModel.getName()+" "+slot.getName()+" "+slot.getParent().getName());
        SwingUtilities.updateComponentTreeUI(treeView);
		
	}



}
