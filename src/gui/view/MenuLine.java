package gui.view;

import javax.swing.JMenuBar;

import app.MainView;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;



public class MenuLine extends JMenuBar {

	public MenuLine() {
		JMenu file=new JMenu("File");
		file.add(MainView.getInstance().getActionManager().getAddNodeAction());
		file.add(MainView.getInstance().getActionManager().getDeleteNodeAction());
		file.add(MainView.getInstance().getActionManager().getRenameNodeAction());
		
		JMenu about=new JMenu("About");
		
		
		JMenu edit=new JMenu("Edit");
		
		
		this.add(file);
		this.add(edit);
		this.add(about);
	}

}

