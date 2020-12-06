package gui.rightPanelView.graphics.painters;

import gui.rightPanelView.graphics.element.SlotElement;
import gui.rightPanelView.graphics.element.TriangleElement;

import java.awt.geom.GeneralPath;

public class TrianglePainter extends DevicePainter{
    public TrianglePainter(SlotElement element) {
        super(element);
        TriangleElement t=(TriangleElement)element;

        shape=new GeneralPath();

        ((GeneralPath)shape).moveTo(t.getPosition().getX(),t.getPosition().getY());
        ((GeneralPath)shape).lineTo(t.getPosition().getX()+t.getSize().width,t.getPosition().getY()+t.getSize().height);
        ((GeneralPath)shape).lineTo(t.getPosition().getX(),t.getPosition().getY()+t.getSize().height);
        ((GeneralPath)shape).closePath();
    }
}
