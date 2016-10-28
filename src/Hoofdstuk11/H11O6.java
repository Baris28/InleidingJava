package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/*
  Created by baris_000 on 25-10-2016.
 */


        public class H11O6 extends Applet {
            public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 30;
        int x = 30;
        int x2 = 50;
        int y2 = 50;



        for (teller = 0; teller < 5; teller++) {
            y +=  20;
            x +=  20;
            y2 -= 10;
            x2 -= 10;
            g.drawOval(x2, y2,x,y);
        }
    }
}
