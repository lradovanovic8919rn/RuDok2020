package repository;

import observer.IListener;
import repository.node.NodeComposite;
import repository.node.RafNode;

public class Slot extends RafNode {

	public Slot(String name, RafNode parent) {
		super(name, parent);

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
}
