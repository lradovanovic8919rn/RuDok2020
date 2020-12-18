package core;

import gui.rightPanelView.PageView;
import gui.rightPanelView.graphics.painters.SlotPainter;

import java.awt.geom.Point2D;

public interface SlotHandler {

    void resize(Point2D start, Point2D dragged, SlotPainter slotPainter, PageView pv);

    void rotate();

    void move();

}