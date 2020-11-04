package repository;

import repository.node.NodeComposite;
import repository.node.RafNode;

public class Workspace extends NodeComposite {

	public Workspace(String name) {
		super(name,null);
	}

    @Override
    public NodeComposite getChildAt(int index) {
        return (NodeComposite) this.getChildren().get(index);
    }

    @Override
    public int getChildCount() {
        return this.getChildren().size();
    }

    @Override
    public void addChild(RafNode child) {
        if (child != null &&  child instanceof Project){
            Project p = (Project) child;
            if (!this.getChildren().contains(p)){
                this.getChildren().add(p);
            }
        }
    }
}
