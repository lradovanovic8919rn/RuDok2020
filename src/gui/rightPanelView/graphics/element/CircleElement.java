package gui.rightPanelView.graphics.element;

import gui.rightPanelView.graphics.painters.CirclePainter;

import java.awt.*;

public class CircleElement extends SlotElement{
    public CircleElement(Shape shape, Dimension size, Point position) {
        super( size, position);
        elementPainter = new CirclePainter(this);

    }
}
