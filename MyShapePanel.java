import java.util.ArrayList;
import java.awt.*;


public class MyShapePanel extends  javax.swing.JPanel{
    private ArrayList<MyShape> shape;

    public MyShapePanel(){
        this.shape = new ArrayList<MyShape>();
        this.setPreferredSize(new Dimension(500, 400));
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        for( MyShape shape : shape){
            shape.draw(graphics);
        }
    }

    public void add(MyShape shape){
        this.shape.add(shape);
    }
}
