package gui.tree.view;

import java.awt.Component;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import gui.tree.model.TreeItem;
import repository.Document;
import repository.Page;
import repository.Project;
import repository.Slot;
import repository.Workspace;

public class RafTreeCellRenderer extends DefaultTreeCellRenderer {
	
	public RafTreeCellRenderer() {
		
	}
	
	 public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {

         super.getTreeCellRendererComponent(tree, value, sel,expanded, leaf, row, hasFocus);

         if (((TreeItem)value).getRafNodeModel() instanceof Workspace) {
             URL imageURL = getClass().getResource("/workspace.png");
             Icon icon = null;
             if (imageURL != null)
                 icon = new ImageIcon(imageURL);
             setIcon(icon);

         }
         if (((TreeItem)value).getRafNodeModel() instanceof Project) {
             URL imageURL = getClass().getResource("/project.png");
             Icon icon = null;
             if (imageURL != null)
                 icon = new ImageIcon(imageURL);
             setIcon(icon);
         }
         if (((TreeItem)value).getRafNodeModel() instanceof Document) {
             URL imageURL = getClass().getResource("/document.png");
             Icon icon = null;
             if (imageURL != null)
                 icon = new ImageIcon(imageURL);
             setIcon(icon);
         }
         if (((TreeItem)value).getRafNodeModel() instanceof Page) {
             URL imageURL = getClass().getResource("/page.png");
             Icon icon = null;
             if (imageURL != null)
                 icon = new ImageIcon(imageURL);
             setIcon(icon);
         }
         if (((TreeItem)value).getRafNodeModel() instanceof Slot) {
             URL imageURL = getClass().getResource("/slot.png");
             Icon icon = null;
             if (imageURL != null)
                 icon = new ImageIcon(imageURL);
             setIcon(icon);
         }
         return this;
     }

}
