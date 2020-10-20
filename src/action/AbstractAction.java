package action;

import javax.swing.*;
import java.net.URL;

public class AbstractAction {

    public Icon loadIcon(String filename){

        URL imageURL = getClass().getResource(filename);
        Icon icon = null;

        if(imageURL != null) icon = new ImageIcon(imageURL);

        return icon;
    }



}
