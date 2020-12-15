package gui.rightPanelView;

import gui.controller.ActionEnum;
import gui.rightPanelView.graphics.painters.SlotPainter;
import gui.rightPanelView.state.StateManager;
import observer.IListener;
import repository.Page;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class PageView extends  JPanel implements IListener {

    private JLabel name;
    private Page page;
    private ViewController viewController;
    private ArrayList<SlotPainter> slotPainters;
    private StateManager stateManager;
    private SlotPainter selectedSlot=null;

    public PageView(Page page) {


        System.out.println("Pravi PageView");
        this.page = page;
        page.addListener(this);
        slotPainters=new ArrayList<SlotPainter>();
        this.setBorder(BorderFactory.createMatteBorder(
               1, 1, 1, 1, Color.red));
        //setBorder(BorderFactory.createEmptyBorder(5,  5,  5,  5));

        name = new JLabel(page.getName());
        this.setPreferredSize(new Dimension(950, 560));
        this.setBackground(Color.WHITE);
        this.add(name);
        viewController=new ViewController();
        this.addMouseListener(viewController);
        stateManager=new StateManager(this);


    }



    @Override
    public void update(Object event) {
        if(event== ActionEnum.ACTION_ADD) {
           // System.out.println("Update Page");
          // name.setText(page.getName());

            repaint();
            revalidate();
        }
        if(event==ActionEnum.ACTION_RENAME){
            System.out.println("Update Page");
            name.setText(page.getName());
            revalidate();
        }
    }

    private class ViewController extends MouseAdapter implements MouseMotionListener {

        public void mousePressed(MouseEvent e) {
            stateManager.getCurrentState().mousePressed(e);
        }

        public void mouseReleased(MouseEvent e) {
            stateManager.getCurrentState().mouseReleased(e);
        }

        public void mouseDragged(MouseEvent e ){
            stateManager.getCurrentState().mouseDragged(e);
        }

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));

        for(SlotPainter sp:this.getSlotPainters()){
            sp.paint(g2,sp.getSlot());

        }


    }


    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public ArrayList<SlotPainter> getSlotPainters() {
        return slotPainters;
    }

    public SlotPainter getSelectedSlot() {
        return selectedSlot;
    }

    public void setSelectedSlot(SlotPainter selectedSlot) {
        this.selectedSlot = selectedSlot;
    }
    public int getElementAtPosition(Point point) {
        for(int i=this.slotPainters.size()-1;i>=0;i--){
            SlotPainter slp = getElementAt(i);
            if(slp.isElementAt(point)){
                return i;
            }
        }
        return -1;
    }
    public SlotPainter getElementAt(int i){
        return slotPainters.get(i);
    }
}