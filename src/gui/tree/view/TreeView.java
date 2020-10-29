package gui.tree.view;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

public class TreeView extends JTree {
	
	public TreeView(DefaultTreeModel model) {
		setModel(model);
		//TCR
		//TCE
		//TSL
		setEditable(true);
	}

}
