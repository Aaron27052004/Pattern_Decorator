import java.awt.*;

public class MyBorderDecorator extends MyShapeDecorator{
    private int vertexRadius;
    private Color vertexColor;

    public MyBorderDecorator(int radius, Color color, MyShape shape){
        super(shape);
        this.vertexRadius=radius;
        this.vertexColor=color;
    }

    protected void drawDecoration(Graphics g){
        g.setColor(vertexColor);
        int width=2*vertexRadius;
        int height=2*vertexRadius;

        for(int i=0;i<decorated.getNumberOfPoints();i++){
            int topLeftX=decorated.getPoint(i).x - vertexRadius;
            int topLeftY=decorated.getPoint(i).y - vertexRadius;

            g.fillOval(topLeftX,topLeftY,width,height);    
        }
    }
}
