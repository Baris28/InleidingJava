package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRoundRect(100,100,100,100,20,20);
        g.setColor(Color.RED);
        g.fillOval(110,110,35,35);
        g.fillOval(160,110,35,35);
        g.fillOval(160,160,35,35);
        g.fillOval(110,160,35,35);
    }
}