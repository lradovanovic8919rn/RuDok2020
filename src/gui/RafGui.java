package gui;

import core.Gui;
import core.Repository;
import gui.view.MainView;
import repository.Workspace;

public class RafGui implements Gui{

	private MainView mv;
	private Repository repository;
	private Workspace workspace;
	
	
	public RafGui(Repository repository) {
		this.repository = repository;
	}



	@Override
	public void start() {
		mv=MainView.getInstance();
		mv.setDocumentRepository(repository);
		mv.setVisible(true);
	}

}
