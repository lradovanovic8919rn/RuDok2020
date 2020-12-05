package core;

public abstract class AppFramework {

	protected Gui gui;
	protected Repository repository;
	protected ErrorHandler errorHandler;
	
	public abstract void run();
	
	public void initialise(Gui g,Repository r,ErrorHandler eh) {
		this.gui=g;
		this.repository=r;
		this.errorHandler=eh;
		this.errorHandler.addListener(gui);
	}

	public ErrorHandler getErrorHandler() {
		return errorHandler;
	}
}
