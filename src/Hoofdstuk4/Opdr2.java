import java.awt.*;
import java.applet.*;

public class Opdr2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(100,300,200,100);
        g.setColor(Color.BLACK);
        g.fillRect(200,350,50,50);
        g.setColor(Color.GREEN);
        g.fillRect(150,325,30,30);
    }
}
