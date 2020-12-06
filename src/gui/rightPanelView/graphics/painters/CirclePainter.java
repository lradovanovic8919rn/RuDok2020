package gui.rightPanelView.graphics.painters;

import gui.rightPanelView.graphics.element.CircleElement;
import gui.rightPanelView.graphics.element.SlotElement;

import java.awt.geom.GeneralPath;

public class CirclePainter extends DevicePainter{

    public CirclePainter(SlotElement element) {
        super(element);
        CircleElement cr=(CircleElement)element;

        shape=new GeneralPath();

        ((GeneralPath)shape).moveTo(cr.getPosition().getX()+cr.getSize().getWidth()/2,cr.getPosition().getY());
        ((GeneralPath)shape).quadTo(cr.getPosition().getX()+cr.getSize().getWidth(),cr.getPosition().getY(), cr.getPosition().getX()+cr.getSize().getWidth(),cr.getPosition().getY()+cr.getSize().getHeight()/2);
        ((GeneralPath)shape).quadTo(cr.getPosition().getX()+cr.getSize().getWidth(),cr.getPosition().getY()+cr.getSize().getHeight(),cr.getPosition().getX()+cr.getSize().getWidth()/2, cr.getPosition().getY()+cr.getSize().getHeight());
        ((GeneralPath)shape).quadTo(cr.getPosition().getX(),cr.getPosition().getY()+cr.getSize().getHeight(),cr.getPosition().getX(), cr.getPosition().getY()+cr.getSize().getHeight()/2);
        ((GeneralPath)shape).quadTo(cr.getPosition().getX(),cr.getPosition().getY(),cr.getPosition().getX()+cr.getSize().getWidth()/2,cr.getPosition().getY());
    }
}
