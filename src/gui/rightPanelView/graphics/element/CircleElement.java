package gui.rightPanelView.graphics.element;

import gui.rightPanelView.graphics.painters.CirclePainter;

import java.awt.*;

public class CircleElement extends SlotElement{
    public CircleElement(Paint paint, Stroke stroke, Dimension size, Point position) {
        super(paint, stroke, size, position);
        elementPainter = new CirclePainter(this);

    }
}
