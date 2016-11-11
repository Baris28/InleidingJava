package Hoofdstuk13;

/*
  Created by baris_000 on 11-11-2016.
 */

import java.applet.Applet;
import java.awt.*;

public class H13O5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.RED);
        boom(g, 100, 100, 20, 90);
    }

    private void boom(Graphics g, int boom1, int boom2, int boom3, int boom4) {
        g.setColor(Color.orange);
        g.fillRect(boom1, boom2, boom3, boom4);
        g.setColor(Color.green);
        g.fillOval(boom1-20, boom2-40, boom3+60, boom4);
    }

}