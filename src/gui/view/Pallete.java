package gui.view;

import gui.controller.ActionManager;

import javax.swing.*;

public class Pallete extends JToolBar{
    public Pallete(){
        add(ActionManager.getInstance().getCircleAction());
        add(ActionManager.getInstance().getRectangleAction());
        add(ActionManager.getInstance().getTriangleAction());
        add(ActionManager.getInstance().getSelectAction());
        add(ActionManager.getInstance().getDeleteAction());
        setFloatable(false);
        setOrientation(JToolBar.VERTICAL);
    }
}
