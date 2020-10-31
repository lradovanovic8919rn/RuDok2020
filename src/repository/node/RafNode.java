package repository.node;

public abstract class RafNode {

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
