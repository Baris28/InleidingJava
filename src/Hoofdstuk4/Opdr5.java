import java.awt.*;
import java.applet.*;

public class Opdr5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 100, 50, 90, 135);

    }
}