package gui.tree.view;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;


import gui.tree.controller.RafTreeSelectionListener;

public class TreeView extends JTree {
	
	public TreeView(DefaultTreeModel defaultTree) {
		setModel(defaultTree);
		RafTreeCellRenderer rtcr=new RafTreeCellRenderer(); ;
		addTreeSelectionListener(new RafTreeSelectionListener());
		setCellRenderer(rtcr);
		//TCE
		setEditable(true);
	}

}
