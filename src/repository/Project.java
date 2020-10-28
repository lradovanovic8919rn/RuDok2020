package repository;

import repository.node.Node;
import repository.node.NodeComposite;

public class Project extends NodeComposite {

	public Project(String name, Node parent) {
		super(name, parent);
	}

	@Override
    public void addChild(Node child) {
        if (child != null &&  child instanceof Document){
        	Document doc = (Document) child;
            if (!this.getChildren().contains(doc)){
                this.getChildren().add(doc);
            }
        }
    }

}
