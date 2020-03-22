package training.javaconfig.colors;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Arsen Adzhiametov on 01-Jun-14 in IntelliJ IDEA.
 */
public class ColoredFrame extends JFrame{

    private Color color;

    public void init() {
        setSize(200, 200);
        Random random = new Random();
        setLocation(random.nextInt(1720), random.nextInt(1000));
        getContentPane().setBackground(color);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
