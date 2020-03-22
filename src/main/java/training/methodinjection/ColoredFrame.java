package training.methodinjection;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Arsen Adzhiametov on 01-Jun-14 in IntelliJ IDEA.
 */
public abstract class ColoredFrame extends JFrame{

    public void init() {
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void showOnRandomPlace(){
        Random random = new Random();
        setLocation(random.nextInt(1720), random.nextInt(1000));
        getContentPane().setBackground(getColor());
        repaint();
        validate();
    }

    public abstract Color getColor();

}
