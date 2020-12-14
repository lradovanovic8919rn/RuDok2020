package gui.rightPanelView.state;

import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.CirclePainter;
import gui.rightPanelView.graphics.painters.DevicePainter;
import gui.rightPanelView.graphics.painters.ElementPainter;
import repository.factory.CircleFactory;
import repository.factory.SlotFactory;
import repository.slot.CircleSlot;
import repository.slot.Slot;
import repository.slot.SlotTypeEnum;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

public class CircleState extends State{

    private PageView mediator;

    public CircleState(PageView mediator) {
        this.mediator = mediator;
    }

    public void mousePressed(MouseEvent e) {
        Point position = e.getPoint();
        if (e.getButton()== MouseEvent.BUTTON1){
          //  if (mediator.getDeviceAtPosition(position)==-1){
            SlotFactory slotFactory=new CircleFactory();
            Slot slot=slotFactory.createSlot("Circle"+mediator.getPage().getChildCount(), SlotTypeEnum.C, mediator.getPage(), position);
            ElementPainter painter=new CirclePainter(slot);
           // }
        }
    }
}
