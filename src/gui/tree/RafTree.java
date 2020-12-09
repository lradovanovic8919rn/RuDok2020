package gui.tree;

import javax.swing.JTree;

import com.sun.source.tree.Tree;
import gui.tree.model.TreeItem;
import repository.Document;
import repository.Page;
import repository.Project;
import repository.Slot;
import repository.Workspace;
import repository.node.RafNode;

public interface RafTree {

	JTree generateTree(Workspace workspace);
	void addProject(Project project);
	void addPage(Page page);
	void addSlot(Slot slot);
	void addDocument(Document document);
	RafNode getSelectedNode();
	void deleteNode(RafNode node);
	void insert(RafNode node);
	void removeFromOldParent(RafNode child,RafNode parent);
	
}
