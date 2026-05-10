import java.awt.*;

public class MyBorderDecorator extends MyShapeDecorator{
    private int vertexRadius;
    private Color vertexColor;

    public MyBorderDecorator(int rayon, Color color, MyShape shape){
        super(shape);
        this.vertexRadius=rayon;
        this.vertexColor=color;
    }

    protected void drawDecoration(Graphics g){
        g.setColor(vertexColor);
        for(int i=0;i<decorated.getNumberOfPoint();i++){
            g.fillOval(decorated.getPoint(i).x - vertexRadius/2 ,decorated.getPoint(i).y - vertexRadius/2 ,vertexRadius,vertexRadius);    
        }
    }
}
