import java.awt.*;

public class MyCenterDecorator extends MyShapeDecorator{
    private int crossRadius;
    private Color crossColor;

    public MyCenterDecorator(int rayon , Color color, MyShape shape){
        super(shape);
        this.crossRadius=rayon;
        this.crossColor=color;
    }

    public void drawDecoration(Graphics g){
        g.setColor(crossColor);

        int sumx=0;
        int sumy=0;
        for(int i =0; i< decorated.getNumberOfPoint(); i++){
            sumx+=decorated.getPoint(i).x;
            sumy+=decorated.getPoint(i).y;
        }
        int xbari=sumx/decorated.getNumberOfPoint();
        int ybari=sumy/decorated.getNumberOfPoint();

        g.drawLine(xbari - crossRadius ,ybari  , xbari + crossRadius ,ybari );
        g.drawLine(xbari  ,ybari - crossRadius , xbari ,ybari +crossRadius);
    }

}