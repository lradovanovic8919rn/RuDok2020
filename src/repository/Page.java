package repository;

import repository.node.RafNode;
import repository.node.NodeComposite;


public class Page extends NodeComposite{

	public Page(String name, RafNode parent) {
		super(name, parent);
	}
	
	@Override
    public void addChild(RafNode child) {
        if (child != null &&  child instanceof Document){
        	Slot s = (Slot) child;
            if (!this.getChildren().contains(s)){
                this.getChildren().add(s);
            }
        }
    }
}
