package gui.tree.model;

import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

import repository.Workspace;
import repository.node.NodeComposite;
import repository.node.RafNode;

public class TreeItem extends DefaultMutableTreeNode {
	
	private String name;
	private RafNode node; // instanca je bilo koje klase u modeluy
	
	public 	TreeItem(String name, RafNode node) {
		super();
		this.name = name;
		this.node = node;
	}
	
	public TreeItem( RafNode node) {
		
		this.node = node;
	}
	
	@Override
	public int getChildCount() {
		if(node instanceof NodeComposite) {
			return ((NodeComposite) node).getChildren().size();
		}
		return 0;
	}
	
	@Override
	public boolean getAllowsChildren() {
		if(node instanceof NodeComposite) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean isLeaf() {
		if (!(node instanceof Workspace) && (node != null)) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public Enumeration children() {
		if(node instanceof NodeComposite) {
		return (Enumeration)((NodeComposite) node).getChildren();
		}else {
			return null;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(o != null && o instanceof TreeItem) {
			TreeItem o2=(TreeItem) o;
			return this.node.equals(o2.node);
		}else {
			return false;
		}		
	}
	
	private TreeNode findChildByIndex(int index) {
		if(node instanceof NodeComposite) {
			TreeItem i = new TreeItem (((NodeComposite) node).getChildren().get(index));
			 
			Iterator childrenIterator = children.iterator();
	        TreeNode current;
		
	        while(childrenIterator.hasNext()) {
	        	current = (TreeNode) childrenIterator.next();
	        	if(current.equals(i)) {
	        		return current;
	        	}
	        }
		}
		
		return null;
	}
	
	@Override 
	public TreeNode getChildAt(int index) {
		return findChildByIndex(index);
	}
	
	private int findIndexByChild(TreeItem n) {
		if(this.node instanceof NodeComposite) {
			return ((NodeComposite) this.node).getChildren().indexOf(n.getNode());
		}else {
			return -1;
		}
	}
	
	@Override
    public int getIndex(TreeNode node) {
        return findIndexByChild((TreeItem)node);
    }
	
	

	@Override
	public String toString() {
		return name ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RafNode getNode() {
		return node;
	}

	public void setNode(RafNode node) {
		this.node = node;
	}

	
}
