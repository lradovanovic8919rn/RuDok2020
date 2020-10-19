package app;


import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;

public class MainView extends JFrame {

    private static MainView instance = null;

    private JToolBar toolBar;
    private JMenuBar menu;
    private JSplitPane splitPane;



    private MainView (){
        initElements();
        addElements();
    }

    private void initElements(){
        menu = new JMenuBar();
        toolBar = new JToolBar();
    }

    private void addElements(){
        setTitle("RuDok");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);

        setJMenuBar(menu);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        JScrollPane scroll = new JScrollPane();
        scroll.setMinimumSize(new Dimension(145, 145));
        splitPane.add(scroll);

        add(toolBar, BorderLayout.NORTH);
        add(splitPane,BorderLayout.CENTER);

    }

    public static MainView getInstance() {
        if(instance == null) {
            instance = new MainView();
        }
        return instance;
    }


    public JToolBar getToolBar() {
        return toolBar;
    }

    public void setToolBar(JToolBar toolBar) {
        this.toolBar = toolBar;
    }


    public JSplitPane getSplitPane() {
        return splitPane;
    }

    public void setSplitPane(JSplitPane splitPane) {
        this.splitPane = splitPane;
    }
}
