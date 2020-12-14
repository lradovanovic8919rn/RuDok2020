package gui.rightPanelView.state;

import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.ElementPainter;
import gui.rightPanelView.graphics.painters.RectanglePainter;
import repository.factory.RectangleFactory;
import repository.factory.SlotFactory;
import repository.slot.Slot;
import repository.slot.SlotTypeEnum;

import java.awt.*;
import java.awt.event.MouseEvent;

public class RectangleState extends State{
    private PageView mediator;

    public RectangleState(PageView mediator) {
        this.mediator = mediator;
    }

    public void mousePressed(MouseEvent e) {
        Point position = e.getPoint();
        if (e.getButton()== MouseEvent.BUTTON1){
         //   if (mediator.getDeviceAtPosition(position)==-1){
            SlotFactory slotFactory=new RectangleFactory();
            Slot slot=slotFactory.createSlot("Rectangle"+mediator.getPage().getChildCount(), SlotTypeEnum.R, mediator.getPage(), position);
            ElementPainter painter=new RectanglePainter(slot);
          //  }
        }
    }
}
