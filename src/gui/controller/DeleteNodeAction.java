package gui.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class DeleteNodeAction extends AbstractActionClass{
	 public DeleteNodeAction() {
	        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
	                KeyEvent.VK_F2, ActionEvent.ALT_MASK));
	        putValue(SMALL_ICON, loadIcon("images/delete.png"));
	        putValue(NAME, "Delete Node");
	        putValue(SHORT_DESCRIPTION, "Delete Node");
	    }
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
