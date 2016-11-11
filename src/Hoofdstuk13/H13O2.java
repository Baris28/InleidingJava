package Hoofdstuk13;


import java.awt.*;
import java.applet.*;

/*
  Created by baris_000 on 9-11-2016.
 */

public class H13O2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        tekenDriehoek(g, 25, 125, 100, 25, 175, 125);
    }

    private void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
}
