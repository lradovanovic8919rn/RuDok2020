package repository.slot;

import observer.IListener;
import repository.node.RafNode;

import java.awt.*;
import java.awt.geom.Point2D;

public class Slot extends RafNode {

	private Dimension dimension;
	private Point2D position;

	public Slot(String name, RafNode parent, Dimension dimension, Point2D position) {
		super(name, parent);
		this.dimension = dimension;
		this.position = position;
	}

	@Override
	public void addListener(IListener listener) {

	}

	@Override
	public void removeListener(IListener listener) {

	}

	@Override
	public void notifyListeners(Object event) {

	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public Point2D getPosition() {
		return position;
	}

	public void setPosition(Point2D position) {
		this.position = position;
	}
}