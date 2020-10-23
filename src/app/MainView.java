package app;


import javax.swing.*;

import action.ActionManager;
import gui.view.MenuLine;
import gui.view.Toolbar;

import java.awt.*;
import java.awt.datatransfer.Clipboard;

public class MainView extends JFrame {

    private static MainView instance = null;

    private Toolbar toolBar;
    private MenuLine menu;
    private JSplitPane splitPane;
    private ActionManager actionManager;


    private MainView (){
        
    }
    
    private void init() {
    	
    	initElements();
        addElements();
        
    }

    private void initElements(){
    	actionManager=new ActionManager();
        menu = new MenuLine();
        toolBar = new Toolbar();
        
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
            instance.init();
        }
        return instance;
    }


    public JToolBar getToolBar() {
        return toolBar;
    }

    public void setToolBar(Toolbar toolBar) {
        this.toolBar = toolBar;
    }


    public JSplitPane getSplitPane() {
        return splitPane;
    }

    public void setSplitPane(JSplitPane splitPane) {
        this.splitPane = splitPane;
    }

	public MenuLine getMenu() {
		return menu;
	}

	public void setMenu(MenuLine menu) {
		this.menu = menu;
	}

	public ActionManager getActionManager() {
		return actionManager;
	}
    
}
