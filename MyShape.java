import java.awt.*;

public interface MyShape{
    public void draw(Graphics graphics);
    public int getNumberOfPoint();
    public Point getPoint(int index);
}