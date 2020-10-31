package app;


import core.AppFramework;
import core.Gui;
import core.Repository;
import gui.RafGui;
import gui.view.MainView;
import repository.RepositoryImplementation;

public class Main extends AppFramework {
	
	private static Main instance;
	
	private Main() {
		
	}
	
	public static Main getInstance(){
        if(instance==null){
            instance = new Main();
        }
        return instance;
    }
	
	@Override
	public void run() {
		this.gui.start();
		
	}

    public static void main(String[] args) {

    	Repository r = new RepositoryImplementation();
    	Gui gui=new RafGui(r);
    	AppFramework main=Main.getInstance();
    	MainView.getInstance().setDocumentRepository(r);
    	main.initialise(gui, r); //

    	main.run();
        

    }

	
}


