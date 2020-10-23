package gui.view;


import javax.swing.JButton;
import javax.swing.JToolBar;

import app.MainView;

public class Toolbar extends JToolBar{

	public Toolbar() {
	
		add(MainView.getInstance().getActionManager().getAddNodeAction());
		add(MainView.getInstance().getActionManager().getDeleteNodeAction());
		add(MainView.getInstance().getActionManager().getRenameNodeAction());
		
		this.addSeparator();
	}
}
