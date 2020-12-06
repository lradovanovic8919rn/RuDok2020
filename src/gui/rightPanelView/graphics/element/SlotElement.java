package gui.rightPanelView.graphics.element;

import gui.rightPanelView.graphics.painters.ElementPainter;

import java.awt.*;

public abstract class SlotElement {

    protected Paint paint;
    protected Stroke stroke;
    protected String name;
    protected Dimension size;
    protected Point position;

    protected ElementPainter elementPainter;

    public SlotElement(Paint paint, Stroke stroke, Dimension size, Point position) {
        this.paint = paint;
        this.stroke = stroke;
        this.size = size;
        this.position = position;
    }

    public Paint getPaint() {
        return paint;
    }

    public Stroke getStroke() {
        return stroke;
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

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
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
