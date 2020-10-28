package repository;


import repository.node.NodeComposite;
import repository.node.RafNode;

public class Project extends NodeComposite {

	public Project(String name, RafNode parent) {
		super(name, parent);
	}

	@Override
    public void addChild(RafNode child) {
        if (child != null &&  child instanceof Document){
        	Document doc = (Document) child;
            if (!this.getChildren().contains(doc)){
                this.getChildren().add(doc);
            }
        }
    }

}
