package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/*
  Created by baris_000 on 25-10-2016.
 */

public class H11O7 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 10;
        int x = 10;
        int x2 = 400;
        int y2 = 300;



        for (teller = 0; teller < 51; teller++) {
            y +=  10;
            x +=  10;
            y2 -=  5;
            x2 -=  5;
            g.drawOval(x2, y2,x,y);
        }
    }
}

