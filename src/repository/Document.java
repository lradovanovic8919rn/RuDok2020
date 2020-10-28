package repository;

import repository.node.Node;
import repository.node.NodeComposite;

public class Document extends NodeComposite {

	public Document(String name, Node parent) {
		super(name, parent);

	}

    @Override
    public void addChild(Node child) {
        if (child != null &&  child instanceof Page){
            Page page = (Page) child;
            if (!this.getChildren().contains(page)){
                this.getChildren().add(page);
            }
        }
    }
}
