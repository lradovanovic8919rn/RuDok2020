package gui.controller;

import app.Main;
import error.ErrorEnum;
import gui.view.MainView;
import repository.Project;
import repository.node.RafNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.*;

public class SaveAction extends AbstractActionClass{

    public SaveAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_F1, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("images/add.png"));
        putValue(NAME, "Save");
        putValue(SHORT_DESCRIPTION, "Save");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Nestp");
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileFilter());
        jfc.showOpenDialog(MainView.getInstance());
        RafNode project = MainView.getInstance().getTree().getSelectedNode();
        File projectFile;

        if ((project instanceof Project)) {

            projectFile = ((Project) project).getFile();

            if (!((Project) project).isChanged()) {
                return;
            }

            if (((Project) project).getFile() == null) {
                if (jfc.showSaveDialog(MainView.getInstance()) == JFileChooser.APPROVE_OPTION) {
                    projectFile = jfc.getSelectedFile();

                } else {
                    return;
                }
            }

            ObjectOutputStream os;
            try {
                os = new ObjectOutputStream(new FileOutputStream(projectFile));
                os.writeObject(project);
                ((Project)project).setFile(projectFile);
                ((Project)project).setChanged(false);

            }catch (IOException e1) {
                e1.printStackTrace();
            }

        } else {
            Main.getInstance().getErrorHandler().generateError(ErrorEnum.ERROR_ALREADYPARENT);
        }
    }

}


