import java.util.ArrayList;
import java.awt.*;


public class MyShapePanel extends  javax.swing.JPanel{
    private ArrayList<MyShape> shapes;

    public MyShapePanel(){
        this.shapes = new ArrayList<MyShape>();
        this.setPreferredSize(new Dimension(500, 400));
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        for( MyShape shape : shapes){
            shape.draw(graphics);
        }
    }

    public void add(MyShape shape){
        this.shapes.add(shape);
    }
}
