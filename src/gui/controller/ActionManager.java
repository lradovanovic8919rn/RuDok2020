package gui.controller;

import javax.swing.*;

public class ActionManager {

	private static ActionManager instance;

	private AddNodeAction addNodeAction;
	private DeleteNodeAction deleteNodeAction;
	private AboutAction aboutAction;
	private TriangleAction triangleAction;
	private RectangleAction rectangleAction;
	private CircleAction circleAction;
	private ShareDocumentAction shareDocumentAction;
	private SelectAction selectAction;

	private ActionManager() {
		init();
	}
	
	private void init() {
		addNodeAction = new AddNodeAction();
		deleteNodeAction = new DeleteNodeAction();
		aboutAction = new AboutAction();
		triangleAction = new TriangleAction();
		rectangleAction = new RectangleAction();
		circleAction = new CircleAction();
		shareDocumentAction = new ShareDocumentAction();
		selectAction=new SelectAction();
	}

	public AddNodeAction getAddNodeAction() {
		return addNodeAction;
	}

	public DeleteNodeAction getDeleteNodeAction() {
		return deleteNodeAction;
	}

	public AboutAction getAboutAction() {
		return aboutAction;
	}

	public TriangleAction getTriangleAction() {
		return triangleAction;
	}

	public RectangleAction getRectangleAction() {
		return rectangleAction;
	}

	public CircleAction getCircleAction() {
		return circleAction;
	}

	public ShareDocumentAction getShareDocumentAction() {
		return shareDocumentAction;
	}

	public SelectAction getSelectAction() {
		return selectAction;
	}

	public static ActionManager getInstance(){

		if(instance==null) instance = new ActionManager();
		return instance;

	}


}
