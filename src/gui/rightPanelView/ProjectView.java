package gui.rightPanelView;

import com.sun.source.tree.Tree;
import gui.controller.ActionEnum;
import gui.tree.model.TreeItem;
import gui.view.MainView;
import observer.IListener;
import repository.Document;
import repository.Project;
import repository.node.RafNode;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ProjectView extends JPanel implements IListener {

    private JLabel projectName;
    private JTabbedPane documents;
    private Project project;
    public static ArrayList<ProjectView> projectViews = new ArrayList<ProjectView>();
    private ArrayList<DocumentView> documentViews;
    private boolean focused;


    public ProjectView(Project project){

        this.project = project;
        this.project.addListener(this);
        documentViews = new ArrayList<DocumentView>();

        projectName = new JLabel(project.getName());
        project.addListener(this);
        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new BorderLayout());
        documents = new JTabbedPane(JTabbedPane.TOP);


        panel.add(documents,BorderLayout.CENTER);
        add(panel,BorderLayout.CENTER);
        add(projectName,BorderLayout.NORTH);
        focused=false;

    }


    public JLabel getProjectName() {
        return projectName;
    }

    public void setProjectName(JLabel projectName) {
        this.projectName = projectName;
    }

    public JTabbedPane getDocuments() {
        return documents;
    }

    public void setDocuments(JTabbedPane documents) {
        this.documents = documents;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

  //  public static ArrayList<ProjectView> getProjectViews() {return projectViews;}

  //  public static void setProjectViews(ArrayList<ProjectView> projectViews) {ProjectView.projectViews = projectViews;}

    public ArrayList<DocumentView> getDocumentViews() {
        return documentViews;
    }

    public void setDocumentViews(ArrayList<DocumentView> documentViews) {
        this.documentViews = documentViews;
    }

    @Override
    public void update(Object event) {
        //this.project.setChanged(true);
        System.out.println("Update u ProjectView");
        if(event == ActionEnum.ACTION_ADD) {
            addTab();
        }else if(event == ActionEnum.ACTION_RENAME){
            projectName.setText((project.getName()));
        }else if(event == ActionEnum.ACTION_REMOVE) {
            removeTab();
        }else if(event == ActionEnum.ACTION_FOCUS){
            focus();
        }else if(event == ActionEnum.ACTION_DOCUMENTDELETE){
            removeDoc();
        }

    }

    public void addTab() {
        System.out.println("Ulazi u addTab");
        //if(!(documents.getTabCount() == project.getChildCount())) {
        Document d = (Document) project.getChildAt(project.getChildCount()-1);
        DocumentView dView = new DocumentView(d);
        documentViews.add(dView);
        documents.addTab(dView.getName(), dView);
        focus();
        revalidate();
        //}

    }

    private void removeTab() {
        TreeItem d = ((TreeItem) MainView.getInstance().getWorkspaceTree().getSelectionPath().getLastPathComponent());
        RafNode p = d.getRafNodeModel().getParent();

        this.setVisible(false);
        //this.getDocumentViews().remove(((Project) p).getIndex(p));

    }

    public void addClickedTab(Document document) {
        documents.removeAll();
        for(DocumentView d: documentViews) {
            documents.add(d);
        }
    }

    public DocumentView getDocumentViewAt(ProjectView pv,int index){
        return this.documentViews.get(index);

    }

    public void focus(){
        System.out.println("Dodje do focusa");
        System.out.println(this.getProject().getName());
        //System.out.println(MainView.getInstance().getSplitPane().getRightComponent().getName());
        //MainView.getInstance().getSplitPane().getRightComponent().add(BorderLayout.CENTER,this);
        MainView.getInstance().getSplitPane().setRightComponent(this);

        MainView.getInstance().getSplitPane().revalidate();
        MainView.getInstance().getSplitPane().repaint();
        setProjectFocused(this);

    }

    private void removeDoc(){
        TreeItem d = ((TreeItem) MainView.getInstance().getWorkspaceTree().getSelectionPath().getLastPathComponent());
        Document doc = (Document) d.getRafNodeModel();

        System.out.println(doc.toString());
        String spliter = " ";
        String[] docdoc = doc.toString().split(spliter);

        for(String a : docdoc){
            System.out.println(a);
        }

        String a = docdoc[1];
        System.out.println(a);
        //System.out.println(docdoc);
        int index = Integer.parseInt(a);
        documents.remove(index);

        MainView.getInstance().getSplitPane().revalidate();
        MainView.getInstance().getSplitPane().repaint();
        System.out.println("RemoveDOC");

    }


    public void setProjectFocused(ProjectView pv){
        for(ProjectView prv:projectViews){
            prv.setFocused(false);
        }
        pv.setFocused(true);
    }

    public boolean isFocused() {
        return focused;
    }

    public void setFocused(boolean focused) {
        this.focused = focused;
    }
}
