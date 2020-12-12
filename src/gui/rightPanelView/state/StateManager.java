package gui.rightPanelView.state;

import gui.rightPanelView.PageView;


public class StateManager {
    private State currentState;

    CircleState circleState;
    RectangleState rectangleState;
    TriangleState triangleState;

    public StateManager(PageView mediator) {
        this.circleState = new CircleState(mediator);
        this.rectangleState = new RectangleState(mediator);
        this.triangleState = new TriangleState(mediator);
        this.currentState = rectangleState;
    }
    public void setCircleState(){currentState=circleState;}
    public void setRectangleState(){currentState=rectangleState;}
    public void setTriangleState(){currentState=triangleState;}
    public State getCurrentState() {
        return currentState;
    }
}
