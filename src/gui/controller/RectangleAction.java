package gui.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class RectangleAction extends AbstractActionClass{
    public RectangleAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_F3, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("images/square.png"));
        putValue(NAME, "Draw Rectangle");
        putValue(SHORT_DESCRIPTION, "Draw Rectangle");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
