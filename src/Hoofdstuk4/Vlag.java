import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(100,100,500,50);
        g.setColor(Color.black);
        g.drawLine(100,500,100,100);
        g.setColor(Color.BLUE);
        g.fillRect(100,200,500,50);
    }
}
