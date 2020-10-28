package repository.node;

import java.util.ArrayList;
import java.util.List;

public abstract class NodeComposite extends Node{
	
	List<Node> children;
	

	public NodeComposite(String name, Node parent) {
		super(name, parent);
		this.children = new ArrayList<>();
	}
	
	public NodeComposite(String name, Node parent,List<Node> children) {
		super(name, parent);
		this.children = new ArrayList<>();
	}

	public abstract void addChild(Node child);
	
	public Node getChildByName(String name) {
        for (Node child: this.getChildren()) {
            if (name.equals(child.getName())) {
                return child;
            }
        }
        return null;
    }

	public List<Node> getChildren() {
		return children;
	}
	
}
