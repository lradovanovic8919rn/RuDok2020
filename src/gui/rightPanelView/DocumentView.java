package gui.rightPanelView;

import observer.IListener;
import repository.Document;

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

        public DocumentView(Document document){
            super(new BorderLayout());
            this.document = document;
            pages = new ArrayList<PageView>();

            split = new JSplitPane();
            scroll = new JScrollPane();
            panel = new JPanel();
            GridLayout grid = new GridLayout(0, 1);
            grid.setVgap(20);
            panel2 = new JPanel(grid);
            scroll.setViewportView(panel2);

            split.setLeftComponent(scroll);
            split.setRightComponent(panel);

            scroll.setMinimumSize(new Dimension(145, 145));
            panel.setMinimumSize(new Dimension(800, 500));

            name = new JLabel(document.toString());
            document.addListener(this);

            add(split);


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

    }
}
