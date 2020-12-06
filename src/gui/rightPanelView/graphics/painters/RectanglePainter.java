package gui.rightPanelView.graphics.painters;

import gui.rightPanelView.graphics.element.RectangleElement;
import gui.rightPanelView.graphics.element.SlotElement;

import java.awt.geom.GeneralPath;

public class RectanglePainter extends DevicePainter {
    public RectanglePainter(SlotElement element) {
        super(element);

        RectangleElement rectangle = (RectangleElement) element;

        shape=new GeneralPath();
        ((GeneralPath)shape).moveTo(rectangle.getPosition().x,rectangle.getPosition().y);

        ((GeneralPath)shape).lineTo(rectangle.getPosition().x+rectangle.getSize().width,rectangle.getPosition().y);

        ((GeneralPath)shape).lineTo(rectangle.getPosition().x+rectangle.getSize().width,rectangle.getPosition().y+rectangle.getSize().height);

        ((GeneralPath)shape).lineTo(rectangle.getPosition().x,rectangle.getPosition().y+rectangle.getSize().height);

        ((GeneralPath)shape).closePath();

    }
}
