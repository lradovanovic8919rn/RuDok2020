package gui.rightPanelView.graphics.element;

import gui.rightPanelView.graphics.painters.TrianglePainter;

import java.awt.*;

public class TriangleElement extends SlotElement{
    public TriangleElement( Dimension size, Point position) {
        super( size, position);
        elementPainter = new TrianglePainter(this);

    }
}
