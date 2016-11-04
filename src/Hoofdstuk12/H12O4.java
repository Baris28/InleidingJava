package Hoofdstuk12;

/*
  Created by baris_000 on 3-11-2016.
 */

import java.awt.*;
import java.applet.*;

public class H12O4 extends Applet {
    private boolean gevonden;
    private double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };

    public void init() {
        double gezocht = 400;
        gevonden = true;
        int teller = 0;
        while(teller < salaris.length) {
            if(salaris[teller] == gezocht) {
                gevonden = false;
            }
            teller ++;
        }
    }

    public void paint(Graphics g) {
        if(gevonden) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }
}
