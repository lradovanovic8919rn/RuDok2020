package gui.rightPanelView.state;

import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.SlotPainter;

import java.awt.*;
import java.awt.event.MouseEvent;

public class SelectState extends State{
    private PageView mediator;

    public SelectState(PageView mediator) {
        this.mediator = mediator;
    }
    public void mousePressed(MouseEvent e) {
        Point position = e.getPoint();
        if (e.getButton()== MouseEvent.BUTTON1){

            for(SlotPainter sp: mediator.getSlotPainters()){
                if((sp.isElementAt(position))&&(mediator.getSelecetedSlotPainters().contains(sp))){
                    sp.setPaint(Color.RED);
                    mediator.getSelecetedSlotPainters().remove(sp);
                    mediator.getPage().removeSelectedSlot(sp.getSlot());
                }else if(sp.isElementAt(position)){
                    sp.setPaint(Color.GREEN);
                    mediator.getSelecetedSlotPainters().add(sp);
                    mediator.getPage().setSelected(sp.getSlot());
                    break;
                }
            }

        }
    }
}
