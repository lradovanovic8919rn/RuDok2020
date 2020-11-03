package gui.tree;

import javax.swing.JTree;

import repository.Document;
import repository.Page;
import repository.Project;
import repository.Slot;
import repository.Workspace;

public interface RafTree {

	JTree generateTree(Workspace workspace);
	void addProject(Project project);
	void addPage(Page page, Object o);
	void addSlot(Slot slot, Object o);
	void addDocument(Document document, Object o);
	
	//Dodajem RafNode get selected node
}
