package training.colorfactorybean;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Arsen Adzhiametov on 01-Jun-14 in IntelliJ IDEA.
 */
public class ColoredFrame extends JFrame{

    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    @PostConstruct
    public void init() {
        setSize(200, 200);
        getContentPane().setBackground(color);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
