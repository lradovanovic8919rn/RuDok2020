package repository.node;

import observer.IListener;
import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class NodeComposite extends RafNode implements IObserver {
	
	 List<RafNode> children;
	 private ArrayList<IListener> listeners;

	public NodeComposite(String name, RafNode parent) {
		super(name, parent);
		this.children = new ArrayList<>();
	}
	
	public NodeComposite(String name, RafNode parent,List<RafNode> children) {
		super(name, parent);
		this.children = new ArrayList<>();
	}

	public abstract void addChild(RafNode child);
	
	public RafNode getChildByName(String name) {
        for (RafNode child: this.getChildren()) {
            if (name.equals(child.getName())) {
                return child;
            }
        }
        return null;
    }



	public List<RafNode> getChildren() {
		return children;
	}

	@Override
	public void addListener(IListener listener) {
		if(listener == null) return;
		if(listeners == null) listeners = new ArrayList<IListener>();
		if(listeners.contains(listener)) return;
		listeners.add(listener);

	}

	@Override
	public void removeListener(IListener listener) {
		if(listener == null || listeners == null || !listeners.contains(listener)) return;
		listeners.remove(listener);
	}

	@Override
	public void notifyListeners(Object event) {
		if(this.listeners == null || this.listeners.isEmpty() || event == null)
			return;
		for(IListener l: listeners) {
			l.update(event);
		}
	}


}
