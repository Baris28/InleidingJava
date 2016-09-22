/**
 * Created by baris_000 on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class Test extends Applet {
    double a;
    double b;
    double uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("Baris  " + uitkomst, 20, 20);
        g.drawString("Jan  " + uitkomst, 20, 30);
        g.drawString("Jeannette  " +uitkomst , 20, 40);
        g.drawString("Ali  " +uitkomst, 20, 50);

    }
}
