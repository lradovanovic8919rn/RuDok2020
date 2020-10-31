package gui.view;


import javax.swing.*;

import core.Repository;
import gui.controller.ActionManager;
import gui.tree.RafTree;
import gui.tree.model.TreeItem;
import gui.tree.view.RafTreeImplementation;
import gui.tree.view.TreeView;
import gui.view.MenuLine;
import gui.view.Toolbar;
import repository.RepositoryImplementation;
import repository.Workspace;

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
    private Repository documentRepository;
    private JTree workspaceTree;
    private RafTree tree;


    private MainView() {

    }

    private void init() {

        initElements();
        addElements();

    }

    private void initElements() {
        actionManager = ActionManager.getInstance();
        menu = new MenuLine();
        toolBar = new Toolbar();
        documentRepository = new RepositoryImplementation();
        tree = new RafTreeImplementation();
        workspaceTree = tree.generateTree(documentRepository.getWorkspace());


    }

    private void addElements() {
        setTitle("RuDok");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);

        setJMenuBar(menu);

        JScrollPane scroll = new JScrollPane(workspaceTree);
        scroll.setSize(420, 420);
        scroll.setMinimumSize(new Dimension(200, 200));

        panel2 = new JPanel(new BorderLayout());

        splitPane = new JSplitPane(SwingConstants.VERTICAL, scroll, panel2);

        splitPane.setDividerLocation(300);
        getContentPane().add(splitPane,BorderLayout.CENTER);
        add(toolBar, BorderLayout.NORTH);



    }

    public static MainView getInstance() {
        if (instance == null) {
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

    public Repository getDocumentRepository() {
        return documentRepository;
    }

    public void setDocumentRepository(Repository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public JTree getWorkspaceTree() {
        return workspaceTree;
    }

    public void setWorkspaceTree(JTree workspaceTree) {
        this.workspaceTree = workspaceTree;
    }

    public void setWorkspaceTree(TreeView workspaceTree) {
        this.workspaceTree = workspaceTree;
    }
}