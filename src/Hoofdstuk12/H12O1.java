package Hoofdstuk12;

import java.awt.*;
import java.applet.*;


/*
  Created by baris_000 on 28-10-2016.
 */

public class H12O1 extends Applet {
    private int salaris[];
    private int uitkomst;

    public void init() {
        salaris = new int [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
            uitkomst = (salaris[0] + salaris[1] + salaris[2] + salaris[3] + salaris[4] + salaris[5]
                    + salaris[6] + salaris[7] + salaris[8] + salaris[9]) / 10;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" +  salaris[teller], 50, 20 * teller + 20);
            g.drawString("Het gemiddelde is " + uitkomst, 50, 260);
        }
    }
}
