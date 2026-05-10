import java.awt.*;
import javax.swing.*;

public class Main{
    
    public static void runApplication() {
        JFrame frame= new JFrame("Decorated shapes");
        MyShapePanel panel= new MyShapePanel();
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack(); frame.setVisible (true);
        MyShape shape0= new MyBorderDecorator(5, Color.red,
                            new MyRectangle (Color.green,
                                new Point( 20, 20), new Point(120, 60) ));

        MyShape shape1= new MyCenterDecorator(7, Color.black,
                            new MyRectangle (Color.cyan,
                                new Point(150, 90), new Point(250, 30) ));
                                                 
        MyShape shape2= new MyCenterDecorator (7, Color.black,
                            new MyBorderDecorator (5, Color.red,
                                new MyPolygon (Color.orange,
                                    new Point(120, 200), new Point(250, 170),
                                        new Point(200, 120), new Point(100, 100),
                                            new Point( 50, 150) )));
        
        MyShape point = new MyBorderDecorator(50, Color.black ,new MyPolygon(Color.black,new Point (100,100)));
        panel.add(shape0); panel.add(shape1); panel.add(shape2); panel.add(point);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater ( ()-> runApplication() );
    }
}