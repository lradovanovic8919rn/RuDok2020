package core;

public abstract class AppFramework {

	protected Gui gui;
	protected Repository repository;
	protected ErrorHandler errorHandler;
	protected SlotHandler slotHandler;
	
	public abstract void run();
	
	public void initialise(Gui g,Repository r,ErrorHandler eh,SlotHandler sh) {
		this.gui=g;
		this.repository=r;
		this.errorHandler=eh;
		this.slotHandler=sh;
		this.errorHandler.addListener(gui);
	}

	public ErrorHandler getErrorHandler() {
		return errorHandler;
	}

	public SlotHandler getSlotHandler() {
		return slotHandler;
	}
}
