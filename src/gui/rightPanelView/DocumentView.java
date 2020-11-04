package gui.rightPanelView;

import gui.controller.ActionEnum;
import gui.view.MainView;
import observer.IListener;
import repository.Document;
import repository.Page;
import repository.Project;
import repository.node.RafNode;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DocumentView extends JPanel implements IListener {

    private Document document;
    private JLabel name;
    private ArrayList<PageView> pages;
    private int pageCount = 0;

    private JSplitPane split;
    private JScrollPane scroll;
    private JPanel panel;
    private JPanel panel2;

    public DocumentView(Document document) {
        super(new GridLayout(0,3));
        this.document = document;
        pages = new ArrayList<PageView>();

        //split = new JSplitPane();

        //scroll = new JScrollPane();
       // scroll.setSize(420, 420);
       // scroll.setMinimumSize(new Dimension(200, 200));
        //panel = new JPanel();
        //GridLayout grid = new GridLayout(0, 1);
       // grid.setVgap(20);
       // panel = new JPanel(grid);
        //scroll.setViewportView(panel2);

        //split.setLeftComponent(scroll);
        //split.setRightComponent(panel);

        //scroll.setMinimumSize(new Dimension(145, 145));
        //  panel.setMinimumSize(new Dimension(800, 500));
        //this.add(scroll);
        //this.add(BorderLayout.CENTER,scroll);
        name = new JLabel(document.toString());
        document.addListener(this);
        //this.add(panel);
        //add(split);


    }


    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


    public String getName() {
        return name.getText();
    }

    public void setName(JLabel name) {
        this.name = name;
    }

    public ArrayList<PageView> getPages() {
        return pages;
    }

    public void setPages(ArrayList<PageView> pages) {
        this.pages = pages;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public JSplitPane getSplit() {
        return split;
    }

    public void setSplit(JSplitPane split) {
        this.split = split;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    @Override
    public void update(Object event) {
        //Project pr = (RafNode) this.document.getParent();
        if (event == ActionEnum.ACTION_ADD) addPage();


    }

    private void addPage() {
        System.out.println("uso u add page metodu");
        if (!(document.getChildCount() == 0) && !(document.getChildCount() == pageCount)) {
            System.out.println("usao u if");
            PageView p = new PageView((Page) document.getChildAt(document.getChildCount() - 1));
            //this.scroll.add(new JPanel());
            //split.setRightComponent(p);
            pages.add(p);
            this.add(p);
        }

    }
}