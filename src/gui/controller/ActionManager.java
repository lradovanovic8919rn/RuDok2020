package gui.controller;

public class ActionManager {
	
	private AddNodeAction addNodeAction;
	private DeleteNodeAction deleteNodeAction;
	private RenameNodeAction renameNodeAction;

	public ActionManager() {
		init();
	}
	
	private void init() {
		addNodeAction=new AddNodeAction();
		deleteNodeAction=new DeleteNodeAction();
		renameNodeAction=new RenameNodeAction();
	}

	public AddNodeAction getAddNodeAction() {
		return addNodeAction;
	}

	public DeleteNodeAction getDeleteNodeAction() {
		return deleteNodeAction;
	}

	public RenameNodeAction getRenameNodeAction() {
		return renameNodeAction;
	}
	
	
}
