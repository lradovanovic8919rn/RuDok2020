package repository;


import gui.controller.ActionEnum;
import observer.IListener;
import repository.node.NodeComposite;
import repository.node.RafNode;

import java.util.ArrayList;

public class Document extends NodeComposite {
    private ArrayList<Page> pages;
    private ArrayList<IListener> listeners;


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

    @Override
    public NodeComposite getChildAt(int index) {
        return (NodeComposite) this.getChildren().get(index);
    }

    @Override
    public int getChildCount() {
        return this.getChildren().size();
    }

}
