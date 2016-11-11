package Hoofdstuk13;

import java.applet.*;
import java.awt.*;

/*
  Created by baris_000 on 11-11-2016.
 */

public class H13O6 extends Applet {

    public void init(){
    }

    public void paint(Graphics g) {
        setBackground(Color.red);
        for(int Kolom = 0; Kolom < 5; Kolom++) {
            for(int Rij = 0; Rij < 2; Rij++) {
                boom(g, 50 + Kolom * 180 + 60 * (Rij%2), (Rij+5) * 40 - 100, 20, 90);
            }
        }
    }

    private void boom(Graphics g, int boom, int boom2, int boom3, int boom4) {
        g.setColor(Color.orange);
        g.fillRect(boom, boom2, boom3, boom4);
        g.setColor(Color.green);
        g.fillOval(boom-20, boom2-40, boom3+60, boom4);
    }
}