package gui.rightPanelView.graphics.element;

import gui.rightPanelView.graphics.painters.RectanglePainter;

import java.awt.*;

public class RectangleElement extends SlotElement{
    public RectangleElement(Paint paint, Stroke stroke, Dimension size, Point position) {
        super(paint, stroke, size, position);
        elementPainter = new RectanglePainter(this);

    }
}
