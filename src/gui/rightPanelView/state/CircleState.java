package gui.rightPanelView.state;

import gui.rightPanelView.PageView;

import java.awt.*;
import java.awt.event.MouseEvent;

public class CircleState extends State{

    private PageView mediator;

    public CircleState(PageView mediator) {
        this.mediator = mediator;
    }

    public void mousePressed(MouseEvent e) {
        Point position = e.getPoint();
        //if (e.getButton()== MouseEvent.BUTTON1){
          //  if (mediator.getDeviceAtPosition(position)==-1){
            //    SlotElement device = CircleElement.createDefault(position,mediator.getDeviceCount());//tek treba dodati
             //   mediator.addSlotElements(device);
           // }
       // }
    }
}