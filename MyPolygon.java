import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyPolygon implements MyShape{
    private Color fillColor;
    private ArrayList<Point> points;

    public MyPolygon(Color fillColor, Point... points){
        this.fillColor=fillColor;
        this.points=new ArrayList<>(List.of(points));
    }

    public void draw(Graphics graphics){
        int[] xpoints = new int[getNumberOfPoint()]; 
        int[] ypoints = new int[getNumberOfPoint()];

        for(int i =0; i< getNumberOfPoint(); i++){
            xpoints[i]=getPoint(i).x;
            ypoints[i]=getPoint(i).y;
        }

        graphics.setColor(fillColor);
        graphics.fillPolygon(xpoints, ypoints, getNumberOfPoint());
    }

    public int getNumberOfPoint(){
        return points.size();
    }

    public Point getPoint(int index){
        return points.get(index);
    } 
}
