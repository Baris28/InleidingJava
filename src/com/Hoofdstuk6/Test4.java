/**
 * Created by baris_000 on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class Test4 extends Applet {

    double a, b, c, uitkomst, berekening;
    int i;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c) / 3;

        Double berekening = new Double(uitkomst * 10);

        int i = berekening.intValue();

        double d = (double) i;

        uitkomst = d / 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + uitkomst, 20, 20);
    }
}