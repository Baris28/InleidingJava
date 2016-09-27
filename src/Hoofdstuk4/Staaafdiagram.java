import java.awt.*;
import java.applet.*;

public class Staaafdiagram extends Applet {
    int a;
    int b;
    int c;

    public void init() {
        a = 40;
        b = 100;
        c = 80;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(50,200,50, -a);
        g.setColor(Color.blue);
        g.fillRect(120,200,50, -b);
        g.setColor(Color.black);
        g.fillRect(190,200,50, -c);
        g.setColor(Color.green);
        g.drawString("Valerie", 50, 40);
        g.drawString("Jeroen", 120, 40);
        g.drawString("Hans", 190, 40);
        g.drawString(a + "kg", 50,50);
        g.drawString(b + "kg", 120,50);
        g.drawString(c + "kg", 190,50);


    }
}