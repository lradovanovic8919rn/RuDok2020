package gui.controller;

import javax.swing.*;

public class ActionManager {

	private static ActionManager instance;

	private AddNodeAction addNodeAction;
	private DeleteNodeAction deleteNodeAction;
	private RenameNodeAction renameNodeAction;
	private AboutAction aboutAction;

	private ActionManager() {
		init();
	}
	
	private void init() {
		addNodeAction=new AddNodeAction();
		deleteNodeAction=new DeleteNodeAction();
		renameNodeAction=new RenameNodeAction();
		aboutAction = new AboutAction();
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

	public AboutAction getAboutAction() {
		return aboutAction;
	}

	public static ActionManager getInstance(){

		if(instance==null) instance = new ActionManager();
		return instance;

	}


}
