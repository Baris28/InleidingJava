import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(100,100,100,300);
        g.setColor(Color.RED);
        g.fillOval(100,100,100,100);
        g.setColor(Color.ORANGE);
        g.fillOval(100,200,100,100);
        g.setColor(Color.GREEN);
        g.fillOval(100,300,100,100);
    }
}