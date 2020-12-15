package gui.rightPanelView.graphics.painters;

import repository.slot.Slot;

import java.awt.*;

public class SlotPainter extends ElementPainter{

    protected Shape shape;
    protected Slot slot;

    public SlotPainter(Slot element) {
        super(element);
        this.slot=element;
    }

    Paint paint=new Color(255,255,255);
    Stroke stroke=new BasicStroke(3f);

    @Override
    public void paint(Graphics2D g, Slot element) {
        g.setPaint(Color.RED);
        g.setStroke(stroke);
        g.draw(getShape());
        g.setPaint(paint);
        g.fill(getShape());

        if(element instanceof Slot){
            g.setPaint(Color.BLACK);
            g.drawString(element.getName(),(int)element.getPosition().getX()+10,
                                            (int)element.getPosition().getY()+10);
        }
    }

    @Override
    public boolean isElementAt(Point position) {
        return getShape().contains(position);
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }
}
