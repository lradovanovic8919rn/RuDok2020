package gui.rightPanelView;

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


    public ProjectView(Project project){

        this.project = project;
        this.project.addListener(this);
        documentViews = new ArrayList<DocumentView>();

        projectName = new JLabel(project.getName());

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new BorderLayout());
        documents = new JTabbedPane(JTabbedPane.TOP);

        panel.add(documents,BorderLayout.CENTER);
        add(panel,BorderLayout.CENTER);
        add(projectName,BorderLayout.NORTH);


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
        }if(event == ActionEnum.ACTION_RENAME){
            projectName.setText((project.getName()));
        }

    }

    public void addTab() {
        System.out.println("Ulazi u addTab");
        //if(!(documents.getTabCount() == project.getChildCount())) {
        Document d = (Document) project.getChildAt(project.getChildCount()-1);
        DocumentView dView = new DocumentView(d);
        documentViews.add(dView);
        documents.addTab(dView.getName(), dView);
        //}
    }


}
