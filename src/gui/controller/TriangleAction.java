package gui.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class TriangleAction extends AbstractActionClass{
    public TriangleAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_F5, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("images/triangle.png"));
        putValue(NAME, "Draw Triangle");
        putValue(SHORT_DESCRIPTION, "Draw Triangle");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
