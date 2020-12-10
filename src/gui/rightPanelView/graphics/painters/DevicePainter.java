package gui.rightPanelView.graphics.painters;

import gui.rightPanelView.graphics.element.SlotElement;

import java.awt.*;

public class DevicePainter extends ElementPainter{

    protected Shape shape;

    public DevicePainter(SlotElement element) {
        super(element);
    }

    Paint paint=new Color(255,255,255);
    Stroke stroke=new BasicStroke(2f);

    @Override
    public void paint(Graphics2D g, SlotElement element) {
        g.setPaint(Color.RED);
        g.setStroke(stroke);
        g.draw(getShape());
        g.setPaint(paint);
        g.fill(getShape());

        if(element instanceof SlotElement){
            g.setPaint(Color.BLACK);
            g.drawString(element.getName(),(int)element.getPosition().getX()+10,
                                            (int)element.getPosition().getY()+10);
        }
    }

    @Override
    public boolean elementAt(SlotElement element, Point position) {
        return getShape().contains(position);
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
