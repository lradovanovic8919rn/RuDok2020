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
            if(!(mediator.getSelectedSlot()==null)){
                for(SlotPainter sp:mediator.getSlotPainters()){
                    sp.setPaint(Color.RED);

                }
            }
            for(SlotPainter sp: mediator.getSlotPainters()){
                if((sp.isElementAt(position))&&(mediator.getSelectedSlot()==sp)){
                    sp.setPaint(Color.RED);
                    mediator.setSelectedSlot(null);
                    mediator.getPage().setSelected(null);
                }else if(sp.isElementAt(position)){
                    sp.setPaint(Color.GREEN);
                    mediator.setSelectedSlot(sp);
                    mediator.getPage().setSelected(sp.getSlot());
                    break;
                }
            }

        }
    }
}
