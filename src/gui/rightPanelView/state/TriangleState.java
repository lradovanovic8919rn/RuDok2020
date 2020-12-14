package gui.rightPanelView.state;

import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.ElementPainter;
import gui.rightPanelView.graphics.painters.TrianglePainter;
import repository.factory.SlotFactory;
import repository.factory.TriangleFactory;
import repository.slot.Slot;
import repository.slot.SlotTypeEnum;

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
          //  if (mediator.getDeviceAtPosition(position)==-1){
                SlotFactory slotFactory=new TriangleFactory();
                Slot slot=slotFactory.createSlot("Triangle"+mediator.getPage().getChildCount(), SlotTypeEnum.T, mediator.getPage(), position);
                ElementPainter element=new TrianglePainter(slot);
       //     }
        }
    }

}
