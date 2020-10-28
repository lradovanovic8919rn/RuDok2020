package gui.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class RenameNodeAction extends AbstractActionClass {

	 public RenameNodeAction() {
	        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
	                KeyEvent.VK_F3, ActionEvent.ALT_MASK));
	        putValue(SMALL_ICON, loadIcon("images/rename.png"));
	        putValue(NAME, "Rename Node");
	        putValue(SHORT_DESCRIPTION, "Rename Node");
	    }
	 
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
