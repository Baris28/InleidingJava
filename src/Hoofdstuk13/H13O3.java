package Hoofdstuk13;

/*
  Created by baris_000 on 10-11-2016.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class H13O3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        muur(g);
    }

    private void muur(Graphics g) {
        g.setColor(Color.red);
        for (int Rijen = 0; 2 + 10 * Rijen < getHeight(); Rijen++) {
            for (int Kolommmen = 0; 2 + 52 * (Kolommmen - 1) < getWidth(); Kolommmen++) {
                if (Rijen % 2 == 0) {
                    g.fillRect(2 + 52 * Kolommmen, 2 + 22 * Rijen, 50, 20);
                } else {
                    g.fillRect(-25 + 52 * Kolommmen, 2 + 22 * Rijen, 50, 20);
                }
            }
        }
    }
}
