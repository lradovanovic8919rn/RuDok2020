package gui.view;


import javax.swing.*;

import core.Repository;
import gui.controller.ActionManager;
import gui.tree.RafTree;
import gui.tree.view.RafTreeImplementation;
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
    private JPanel panel2;
    private JScrollPane scroll;
    
    private Repository repo;
    private RafTree tree;
    private JTree workspaceTree;

    private MainView (){
        
    }
    
    private void initAm() {
    	actionManager=new ActionManager();
    }
    
    private void init() {
    	
    	initElements();
        addElements();
        
    }

    public void initWorkspaceTree(){
    	tree = new RafTreeImplementation();
        workspaceTree = tree.generateTree(repo.getWorkspace());
        init();
    }
    
    private void initElements(){
        menu = new MenuLine();
        toolBar = new Toolbar();
        
    }

    private void addElements(){
        setTitle("RuDok");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,700);

        setJMenuBar(menu);
        
        scroll = new JScrollPane(workspaceTree);
        scroll.setSize(420,420);
        scroll.setMinimumSize(new Dimension(200,200));
        
        panel2=new JPanel(new BorderLayout());
        
        splitPane = new JSplitPane(SwingConstants.VERTICAL,scroll,panel2);
        splitPane.setDividerLocation(300);

        add(toolBar, BorderLayout.NORTH);
        add(splitPane,BorderLayout.CENTER);
        
        
    }

    public static MainView getInstance() {
        if(instance == null) {
            instance = new MainView();
            instance.initAm();
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

	public JPanel getPanel2() {
		return panel2;
	}

	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public Repository getRepo() {
		return repo;
	}

	public void setRepo(Repository repo) {
		this.repo = repo;
	}

	public RafTree getTree() {
		return tree;
	}

	public void setTree(RafTree tree) {
		this.tree = tree;
	}

	public JTree getWorkspaceTree() {
		return workspaceTree;
	}

	public void setWorkspaceTree(JTree workspaceTree) {
		this.workspaceTree = workspaceTree;
	}

	public void setActionManager(ActionManager actionManager) {
		this.actionManager = actionManager;
	}
    
}
