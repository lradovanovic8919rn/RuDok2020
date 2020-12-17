package repository;

import gui.controller.ActionEnum;
import gui.view.MainView;
import repository.node.RafNode;
import repository.node.NodeComposite;
import repository.slot.Slot;

import javax.swing.*;


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
                this.notifyListeners(ActionEnum.ACTION_ADD);

            }
        }
    }

    @Override
    public void removeChild(RafNode node) {
        if (node != null &&  node instanceof Slot){
            Slot slot = (Slot) node;
            this.getChildren().remove(node);
            this.notifyListeners(ActionEnum.ACTION_REMOVE);
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
