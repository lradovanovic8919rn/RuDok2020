package repository;

import gui.controller.ActionEnum;
import gui.view.MainView;
import repository.node.RafNode;
import repository.node.NodeComposite;
import repository.slot.Slot;

import javax.swing.*;
import java.util.ArrayList;


public class Page extends NodeComposite{

    ArrayList<Slot> selectedSlots;

	public Page(String name, RafNode parent) {
		super(name, parent);
        selectedSlots=new ArrayList<Slot>();
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

    public ArrayList<Slot> getSelectedSlots() {
        return selectedSlots;
    }

    public void setSelected(Slot selected) {
        this.selectedSlots.add(selected);
        this.notifyListeners(ActionEnum.ACTION_SELECTED);
    }
    public void removeSelectedSlot(Slot slot){
        this.selectedSlots.remove(slot);
        this.notifyListeners(ActionEnum.ACTION_SELECTED);
    }
}
