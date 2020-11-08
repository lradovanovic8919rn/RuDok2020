package gui.view;


import javax.swing.*;

import core.ErrorHandler;
import core.Repository;
import gui.controller.ActionManager;
import gui.controller.ErrorEnum;
import gui.rightPanelView.ProjectView;
import gui.tree.RafTree;
import gui.tree.model.TreeItem;
import gui.tree.view.RafTreeImplementation;
import gui.tree.view.TreeView;
import gui.view.MenuLine;
import gui.view.Toolbar;
import repository.Project;
import repository.RepositoryImplementation;
import repository.Workspace;

import java.awt.*;

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
    private ErrorHandler errorHandler;




	private MainView() {

    }

    private void init() {

    	actionManager = ActionManager.getInstance();

    }

    public void initTree() {
        tree = new RafTreeImplementation();
        workspaceTree = tree.generateTree(documentRepository.getWorkspace());
        addElements();


    }

    private void addElements() {
        setTitle("RuDok");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);

        menu = new MenuLine();
        toolBar = new Toolbar();
        
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

    public RafTree getTree() {
        return tree;
    }

    public void setTree(RafTree tree) {
        this.tree = tree;
    }

    public void projectViewMaker(Project project) {

        ProjectView p = new ProjectView(project);
        //ProjectView.projectViews.add(p);
        System.out.println("Kreira ");
       // this.splitPane.getRightComponent(p);
        this.panel2.add(BorderLayout.CENTER,p);

    }

    public void openProjectView(ProjectView p) {
        System.out.println("Dodaje projectView  u desni panel");
        if(p == null ) return;
        else{
        this.panel2.add(BorderLayout.CENTER,p);}
    }
    public void fireError(Object o) {
    	if(o==ErrorEnum.ERROR_DELETEWS) {
            JOptionPane.showMessageDialog(null, "Workspace can not be deleted!",
                            "Error!",JOptionPane.ERROR_MESSAGE);
            
    	}if(o==ErrorEnum.ERROR_SLOTCHILDREN) {
            JOptionPane.showMessageDialog(null, "Slot can not have children!",
                            "Error!",JOptionPane.ERROR_MESSAGE);
    	
    	}if(o==ErrorEnum.ERROR_NOSELECTEDNODE) {
            JOptionPane.showMessageDialog(null, "You have to select node first!",
                            "Error!",JOptionPane.ERROR_MESSAGE);    	}
    
    }

    public ErrorHandler getErrorHandler() {
		return errorHandler;
	}

	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}
}