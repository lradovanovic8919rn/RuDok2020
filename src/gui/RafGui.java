package gui;

import core.Gui;
import core.Repository;
import gui.view.MainView;

public class RafGui implements Gui{

	private MainView mv;
	private Repository repository;
	
	
	
	public RafGui(Repository repository) {
		this.repository = repository;
	}



	@Override
	public void start() {
		mv=MainView.getInstance();
		mv.setRepo(repository);
		mv.initWorkspaceTree();
		mv.setVisible(true);
	}

}
