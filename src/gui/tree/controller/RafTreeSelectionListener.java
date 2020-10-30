package gui.tree.controller;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import gui.tree.model.TreeItem;

public class RafTreeSelectionListener implements TreeSelectionListener {

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		TreePath path = arg0.getPath();
        TreeItem treeItemSelected = (TreeItem)path.getLastPathComponent();
        System.out.println("[Selektovan cvor: "+ treeItemSelected.getName()+"]   |  [Putanja: "+arg0.getPath()+" ]");
		
	}

	

}
