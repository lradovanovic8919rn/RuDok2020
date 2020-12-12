package repository;

import repository.node.RafNode;
import repository.node.NodeComposite;
import repository.slot.Slot;


public class Page extends NodeComposite{

	public Page(String name, RafNode parent) {
		super(name, parent);
	}
	
	@Override
    public void addChild(RafNode child) {
        if (child != null &&  child instanceof Slot){
        	Slot s = (Slot) child;
            if (!this.getChildren().contains(s)){
                this.getChildren().add(s);
            }
        }
    }

    //@Override
   // public int getIndex(RafNode aChild) {
     //   return 0;
    //}

    @Override
    public NodeComposite getChildAt(int index) {
        return (NodeComposite) this.getChildren().get(index);
    }

    @Override
    public int getChildCount() {
        return this.getChildren().size();
    }

}
