package gui.view;

import javax.swing.JMenuBar;

import gui.view.MainView;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;



public class MenuLine extends JMenuBar {

	public MenuLine() {
		JMenu file=new JMenu("File");
		
		
		JMenu about=new JMenu("About");
		
		
		JMenu edit=new JMenu("Edit");
		edit.add(MainView.getInstance().getActionManager().getAddNodeAction());
		edit.add(MainView.getInstance().getActionManager().getDeleteNodeAction());
		edit.add(MainView.getInstance().getActionManager().getRenameNodeAction());
		
		this.add(file);
		this.add(edit);
		this.add(about);
	}

}

