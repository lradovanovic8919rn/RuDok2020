package gui.rightPanelView.state;

import app.Main;
import core.AppFramework;
import editor.EditorEnum;
import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.SlotPainter;
import repository.slot.Slot;

import java.awt.*;
import java.awt.event.MouseEvent;

public class SelectState extends State{
    private PageView mediator;
    private Slot s;

    public SelectState(PageView mediator) {
        this.mediator = mediator;
    }
    public void mousePressed(MouseEvent e) {
        Point position = e.getPoint();
        if (e.getButton()== MouseEvent.BUTTON1){
            if(e.getClickCount() == 2) {
                for (SlotPainter sp : mediator.getSlotPainters()) {
                    if (sp.isElementAt(position)) {
                        s=sp.getSlot();
                    }
                }
                if(s.getSlotContent()==null) {
                    Main.getInstance().getEditor().choseContentType(s);

                }else if(s.getSlotContent().getType()==EditorEnum.TEXT){
                    Main.getInstance().getEditor().openTextContent(s);
                }else if(s.getSlotContent().getType()==EditorEnum.IMAGE){
                    Main.getInstance().getEditor().openImageContent(s);
                }
            }
            else if(e.getClickCount()==1) {
                for (SlotPainter sp : mediator.getSlotPainters()) {
                    if ((sp.isElementAt(position)) && (mediator.getSelecetedSlotPainters().contains(sp))) {
                        sp.setPaint(Color.RED);
                        mediator.getSelecetedSlotPainters().remove(sp);
                        mediator.getPage().removeSelectedSlot(sp.getSlot());
                    } else if (sp.isElementAt(position)) {
                        sp.setPaint(Color.GREEN);
                        mediator.getSelecetedSlotPainters().add(sp);
                        mediator.getPage().setSelected(sp.getSlot());
                        break;
                    }
                }
            }
        }
    }
}
