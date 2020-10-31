package repository.node;

import java.util.ArrayList;
import java.util.List;

public abstract class NodeComposite extends RafNode{
	
	 List<RafNode> children;
	

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




}
