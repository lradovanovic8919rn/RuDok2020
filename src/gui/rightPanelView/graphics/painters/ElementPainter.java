package gui.rightPanelView.graphics.painters;

import gui.rightPanelView.graphics.element.SlotElement;

import java.awt.*;

public abstract class ElementPainter {

    public ElementPainter(SlotElement element){ }

    public abstract void paint(Graphics2D g, SlotElement element);

    public  abstract boolean elementAt(SlotElement element,Point position);


}
