import java.awt.*;
import java.applet.*;

public class PraktijkOpdr extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(20, 20, 150, 100);
        g.drawRoundRect(20, 130, 150, 100, 70 , 70);
        g.drawOval(365, 130, 100, 100);
        g.drawOval(340, 20, 150, 100);
        g.setColor(Color.MAGENTA);
        g.fillRect(180, 20, 150, 100);
        g.fillOval(180, 130, 150, 100);
        g.fillArc(340, 20, 150, 100, 0, 45);
        g.setColor(Color.BLUE);
        g.drawOval(180, 20, 150, 100);
    }
}