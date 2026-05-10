import java.awt.*;

public class MyRectangle implements MyShape{
    private Color fillColor;
    private Point point0;
    private Point point1;

    public MyRectangle(Color fillColor, Point point0, Point point1){
        this.fillColor=fillColor;
        this.point0=point0;
        this.point1=point1;
    }

    public void draw(Graphics graphics){
        int bottomleftx=Math.min(point0.x, point1.x);
        int bottomlefty=Math.min(point0.y, point1.y);

        int width=Math.abs(point0.x - point1.x);
        int height=Math.abs(point0.y - point1.y);

        graphics.setColor(fillColor);
        graphics.fillRect(bottomleftx, bottomlefty ,width, height);
    }

    public int getNumberOfPoint(){
        return 2;
    }

    public Point getPoint(int index){
        assert index <= 1;
        return index == 0 ? point0 
            : point1;
    }
}

