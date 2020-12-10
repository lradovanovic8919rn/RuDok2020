package gui.rightPanelView.graphics.element;

import gui.rightPanelView.graphics.painters.RectanglePainter;

import java.awt.*;

public class RectangleElement extends SlotElement{
    public RectangleElement(Shape shape, Dimension size, Point position) {
        super( size, position);
        elementPainter = new RectanglePainter(this);

    }
}
