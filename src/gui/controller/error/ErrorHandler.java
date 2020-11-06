package gui.controller.error;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ErrorHandler {
	
	public JFrame deleteWorkspaceException() {
	       JFrame errorFrame = null;
	       JOptionPane.showMessageDialog(errorFrame, "Workspace can not be deleted!",
	                       "Error!",JOptionPane.ERROR_MESSAGE);
	       return errorFrame;
	}
	public JFrame nodeNotSelectedException() {
	       JFrame errorFrame = null;
	       JOptionPane.showMessageDialog(errorFrame, "You have to select node first!",
	                       "Error!",JOptionPane.ERROR_MESSAGE);
	       return errorFrame;
	}
	public JFrame slotChildException() {
	       JFrame errorFrame = null;
	       JOptionPane.showMessageDialog(errorFrame, "Slot can not have children!",
	                       "Error!",JOptionPane.ERROR_MESSAGE);
	       return errorFrame;
	}
}
