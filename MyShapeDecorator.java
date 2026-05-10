import java.awt.*;

public abstract class MyShapeDecorator implements MyShape{
    protected MyShape decorated;

    public MyShapeDecorator(MyShape shape){
        this.decorated=shape;
    }

    public void draw(Graphics graphics){
        decorated.draw(graphics);
        drawDecoration(graphics);
    }

    public int getNumberOfPoint(){
        return decorated.getNumberOfPoint();
    }

    public Point getPoint(int index){
        return decorated.getPoint(index);
    }

    abstract protected void drawDecoration(Graphics graphics);
}
