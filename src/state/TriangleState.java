package state;

import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.element.RectangleElement;
import gui.rightPanelView.graphics.element.SlotElement;

import java.awt.*;
import java.awt.event.MouseEvent;

public class TriangleState extends State {
    private PageView mediator;
    public TriangleState(PageView mediator) {
        this.mediator = mediator;
    }
    public void mousePressed(MouseEvent e) {
        Point position = e.getPoint();
        if (e.getButton()== MouseEvent.BUTTON1){
            if (mediator.getDeviceAtPosition(position)==-1){
                SlotElement device = TriangleElement.createDefault(position,mediator.getDeviceCount());//tek treba dodati
                mediator.addSlotElements(device);
            }
        }
    }

}
