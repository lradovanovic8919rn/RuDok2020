package gui;

import core.ErrorHandler;
import core.Gui;
import core.Repository;
import gui.view.MainView;
import repository.Workspace;

public class RafGui implements Gui{

	private MainView mv;
	private Repository repository;
	private Workspace workspace;
	private ErrorHandler errorHandler;
	
	
	public RafGui(Repository repository, ErrorHandler errorHandler) {
		this.repository = repository;
		this.errorHandler=errorHandler;
	}



	@Override
	public void start() {
		mv=MainView.getInstance();
		mv.setDocumentRepository(repository);
		mv.setErrorHandler(errorHandler);
		mv.initTree();
		mv.setVisible(true);
	}

}
