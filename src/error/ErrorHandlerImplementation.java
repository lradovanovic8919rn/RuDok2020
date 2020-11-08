package error;

import javax.swing.JOptionPane;

import core.ErrorHandler;
import gui.controller.ErrorEnum;
import gui.view.MainView;

public class ErrorHandlerImplementation implements ErrorHandler {

	@Override
	public void noChosenNode() {
		Object o=ErrorEnum.ERROR_NOSELECTEDNODE;
		MainView.getInstance().fireError(o);
	}

	@Override
	public void cantDeleteWorkspace() {
		Object o=ErrorEnum.ERROR_DELETEWS;
		MainView.getInstance().fireError(o);
	}

	@Override
	public void slotCantHaveChildren() {
		Object o=ErrorEnum.ERROR_SLOTCHILDREN;
		MainView.getInstance().fireError(o);
	
	}

}