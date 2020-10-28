package repository;

import repository.node.Node;
import repository.node.NodeComposite;

public class Workspace extends NodeComposite {

	public Workspace(String name) {
		super(name,null);
	}

	@Override
    public void addChild(Node child) {
        if (child != null &&  child instanceof Project){
            Project p = (Project) child;
            if (!this.getChildren().contains(p)){
                this.getChildren().add(p);
            }
        }
    }
}
