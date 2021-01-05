package gui.controller;

import gui.rightPanelView.state.MoveState;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

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
	private DeleteAction deleteAction;
	private ResizeAction resizeAction;
	private MoveSlotAction moveSlotAction;
	private RotateAction rotateAction;
	private LassoAction lassoAction;

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
		deleteAction=new DeleteAction();
		resizeAction=new ResizeAction();
		moveSlotAction=new MoveSlotAction();
		rotateAction=new RotateAction();
		lassoAction=new LassoAction();
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

	public DeleteAction getDeleteAction() { return deleteAction; }

	public ResizeAction getResizeAction() { return resizeAction; }

	public MoveSlotAction getMoveSlotAction() { return moveSlotAction; }

	public RotateAction getRotateAction() { return rotateAction; }

	public LassoAction getLassoAction() {
		return lassoAction;
	}

	public static ActionManager getInstance(){

		if(instance==null) instance = new ActionManager();
		return instance;

	}


}
