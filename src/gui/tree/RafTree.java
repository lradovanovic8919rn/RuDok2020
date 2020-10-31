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
	void addDocument(Document document);
	void addPage(Page page);
	void addSlot(Slot slot);
	
	//Dodajem RafNode get selected node
}
