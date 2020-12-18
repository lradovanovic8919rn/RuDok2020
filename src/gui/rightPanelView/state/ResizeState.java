package gui.rightPanelView.state;

import app.Main;
import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.SlotPainter;


import java.awt.*;
import java.awt.event.MouseEvent;

public class ResizeState extends State {
    PageView mediator;
    Point start;
    Point dragged;

    public ResizeState(PageView mediator) {
        this.mediator = mediator;
    }

    public void mousePressed(MouseEvent e) {

        Point position = e.getPoint();
        if (e.getButton()== MouseEvent.BUTTON1){


                    System.out.println(position.getLocation());
                    start = position;

            }

    }

    public void mouseDragged(MouseEvent e){
        SlotPainter sp=mediator.getSelectedSlot();
        dragged=e.getPoint();

        if(sp==null){

        }
        else {
            Main.getInstance().getSlotHandler().resize(start, dragged, sp, mediator);
        }

    }

    public void mouseReleased(MouseEvent e) {





    }

}
