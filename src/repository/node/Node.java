package repository.node;

public abstract class Node {

	private String name;
	private Node parent;
	
	public Node(String name, Node parent) {
		this.name = name;
		this.parent = parent;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Node) {
			Node obj2 = (Node)obj;
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

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	
	
}
