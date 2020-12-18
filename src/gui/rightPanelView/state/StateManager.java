package gui.rightPanelView.state;

import gui.rightPanelView.PageView;


public class StateManager {
    private State currentState;

    CircleState circleState;
    RectangleState rectangleState;
    TriangleState triangleState;
    SelectState selectState;
    DeleteState deleteState;
    ResizeState resizeState;
    MoveState moveState;

    public StateManager(PageView mediator) {
        this.selectState=new SelectState(mediator);
        this.circleState = new CircleState(mediator);
        this.rectangleState = new RectangleState(mediator);
        this.triangleState = new TriangleState(mediator);
        this.deleteState=new DeleteState(mediator);
        this.resizeState=new ResizeState(mediator);
        this.moveState=new MoveState(mediator);
        this.currentState = circleState;
    }
    public void setSelectState(){currentState=selectState;}
    public void setCircleState(){currentState=circleState;}
    public void setRectangleState(){currentState=rectangleState;}
    public void setTriangleState(){currentState=triangleState;}
    public void setDeleteState(){currentState=deleteState;}
    public void setResizeState(){currentState=resizeState;}
    public void setMoveState(){currentState=moveState;}
    public State getCurrentState() {
        return currentState;
    }
}
