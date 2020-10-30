package core;

public abstract class AppFramework {

	protected Gui gui;
	protected Repository repository;
	
	public abstract void run();
	
	public void initialise(Gui g,Repository r) {
		this.gui=g;
		this.repository=r;
	}
}
