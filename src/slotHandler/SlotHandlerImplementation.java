package slotHandler;

import app.Main;
import core.SlotHandler;
import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.CirclePainter;
import gui.rightPanelView.graphics.painters.RectanglePainter;
import gui.rightPanelView.graphics.painters.SlotPainter;
import gui.rightPanelView.graphics.painters.TrianglePainter;
import repository.Page;
import repository.slot.Slot;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class SlotHandlerImplementation implements SlotHandler {

    @Override
    public void resize(Point2D start, Point2D dragged, SlotPainter slotPainter, PageView mediator) {
        double width=slotPainter.getSlot().getDimension().getWidth()+ (dragged.getX()- start.getX())/25;
        double height=slotPainter.getSlot().getDimension().getHeight()+ (dragged.getY()- start.getY())/25;
        int widthInt=(int)width;
        int heightInt=(int)height;
        slotPainter.getSlot().setDimension(new Dimension(widthInt,heightInt));
        Slot s=slotPainter.getSlot();
        Page p=(Page) s.getParent();
        p.removeChild(s);
        mediator.getSlotPainters().remove(slotPainter);


        mediator.getPage().addChild(s);
        SlotPainter painter=null;
        if(slotPainter instanceof RectanglePainter) {
            painter = new RectanglePainter(s);
        }else if(slotPainter instanceof CirclePainter){
            painter = new CirclePainter(s);
        }else{
            painter=new TrianglePainter(s);
        }

        painter.setPaint(Color.green);
        mediator.getSlotPainters().add(painter);
        mediator.getPage().setSelected(painter.getSlot());
        mediator.setSelectedSlot(painter);


    }

    @Override
    public void rotate() {

    }

    @Override
    public void move() {

    }
}
