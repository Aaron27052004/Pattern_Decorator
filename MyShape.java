import java.awt.*;

public interface MyShape{
    public void draw(Graphics graphics);
    public int getNumberOfPoints();
    public Point getPoint(int index);
}