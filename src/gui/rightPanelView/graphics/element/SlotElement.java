package gui.rightPanelView.graphics.element;

import gui.rightPanelView.graphics.painters.ElementPainter;

import java.awt.*;

public abstract class SlotElement {

    protected String name;
    protected Dimension size;
    protected Point position;

    protected ElementPainter elementPainter;

    public SlotElement( Dimension size, Point position) {
        this.size = size;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Dimension getSize() {
        return size;
    }

    public Point getPosition() {
        return position;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public ElementPainter getPainter() {
		return elementPainter;
	}
}
