package gui.rightPanelView.state;

import app.Main;
import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.SlotPainter;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

public class MoveState extends State{
    Point start;
    PageView mediator;
    SlotPainter sp;
    int originalX;
    int originaly;

    public MoveState(PageView mediator) {
        this.mediator = mediator;
    }


    public void mousePressed(MouseEvent e) {

        Point position = e.getPoint();
        if (e.getButton()== MouseEvent.BUTTON1){

            sp=mediator.getSelectedSlot();
            start = position;
            originaly= (int) sp.getSlot().getPosition().getY();
            originalX= (int) sp.getSlot().getPosition().getX();
            System.out.println(position.getLocation()+" "+mediator.getPage().getSelected().getName());



        }

    }

    public void mouseDragged(MouseEvent e){
        Point dragged=e.getPoint();

            SlotPainter sp=mediator.getSelectedSlot();
            Main.getInstance().getSlotHandler().move(start, dragged, sp, mediator,originalX,originaly);


    }

    public void mouseReleased(MouseEvent e) {





    }
}
