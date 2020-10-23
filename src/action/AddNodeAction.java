package action;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class AddNodeAction extends AbstractActionClass{

	 public AddNodeAction() {
	        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
	                KeyEvent.VK_F1, ActionEvent.ALT_MASK));
	        putValue(SMALL_ICON, loadIcon("images/add.png"));
	        putValue(NAME, "Add Node");
	        putValue(SHORT_DESCRIPTION, "Add Node");
	    }
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	}

}
