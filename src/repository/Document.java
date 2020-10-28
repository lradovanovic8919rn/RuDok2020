package repository;


import repository.node.NodeComposite;
import repository.node.RafNode;

public class Document extends NodeComposite {

	public Document(String name, RafNode parent) {
		super(name, parent);

	}

    @Override
    public void addChild(RafNode child) {
        if (child != null &&  child instanceof Page){
            Page page = (Page) child;
            if (!this.getChildren().contains(page)){
                this.getChildren().add(page);
            }
        }
    }
}
