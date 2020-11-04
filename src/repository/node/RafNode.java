package repository.node;

import gui.controller.ActionEnum;
import gui.tree.RafTree;
import observer.IObserver;
import repository.Document;

public abstract class RafNode implements IObserver {

	private String name;

	private RafNode parent;
	
	public RafNode(String name, RafNode parent) {
		this.name = name;
		this.parent = parent;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof RafNode) {
			RafNode obj2 = (RafNode)obj;
			return this.getName().equals(obj2.getName());
		}
		return false;
	}

	//@Override
	//public RafNode getChildAt(int index) {
//		return this.No.get(index);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		this.notifyListeners(ActionEnum.ACTION_RENAME);
	}

	public RafNode getParent() {
		return parent;
	}

	public void setParent(RafNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return name;
	}



}
