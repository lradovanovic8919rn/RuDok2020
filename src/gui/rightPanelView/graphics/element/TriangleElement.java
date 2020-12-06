package gui.rightPanelView.graphics.element;

import gui.rightPanelView.graphics.painters.TrianglePainter;

import java.awt.*;

public class TriangleElement extends SlotElement{
    public TriangleElement(Paint paint, Stroke stroke, Dimension size, Point position) {
        super(paint, stroke, size, position);
        elementPainter = new TrianglePainter(this);

    }
}
