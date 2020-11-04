package repository;


import gui.controller.ActionEnum;
import observer.IListener;
import observer.IObserver;
import repository.node.NodeComposite;
import repository.node.RafNode;

import javax.swing.tree.MutableTreeNode;
import java.util.ArrayList;

public class Project extends NodeComposite implements  IObserver{

    private boolean changed = false;
    private ArrayList<Document> documents;

    public Project(String name, RafNode parent) {

	    super(name, parent);
	    this.documents = new ArrayList<Document>();
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
        if (child != null &&  child instanceof Document){
        	Document doc = (Document) child;
            if (!this.getChildren().contains(doc)){
                this.getChildren().add(doc);
                this.notifyListeners(ActionEnum.ACTION_ADD);
            }
        }
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        if(!this.changed) {
            this.changed = changed;
        }else {
            this.changed = changed;
        }
    }

    public void add(MutableTreeNode newChild) {
        Document document = (Document)newChild;
        documents.add(document);
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }
}
