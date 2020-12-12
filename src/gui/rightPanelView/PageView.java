package gui.rightPanelView;

import observer.IListener;
import repository.Page;
import repository.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PageView extends  JPanel implements IListener {

    private JLabel name;
    private Page page;
    private ViewController viewController;

    public PageView(Page page) {


        System.out.println("Pravi PageView");
        this.page = page;
        page.addListener(this);
        this.setBorder(BorderFactory.createMatteBorder(
               1, 1, 1, 1, Color.red));
        //setBorder(BorderFactory.createEmptyBorder(5,  5,  5,  5));

        name = new JLabel(page.getName());
        this.setPreferredSize(new Dimension(950, 560));
        this.setBackground(Color.WHITE);
        this.add(name);
        viewController=new ViewController();

    }



    @Override
    public void update(Object event) {
        System.out.println("Update Page");
        //Project pr = (Project)this.page.getParent().getParent();

       // pr.setChanged(true);
        name.setText(page.getName());
    }

    private class ViewController extends MouseAdapter implements MouseMotionListener {

        public void mousePressed(MouseEvent e) {
            //	   documentView.getStateManager().getCurrentState().mousePressed(e);
        }

        public void mouseReleased(MouseEvent e) {
            //	   documentView.getStateManager().getCurrentState().mouseReleased(e);
        }

        public void mouseDragged(MouseEvent e ){
            //	   documentView.getStateManager().getCurrentState().mouseDragged(e);
        }

    }


    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}