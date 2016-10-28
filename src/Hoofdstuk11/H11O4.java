package Hoofdstuk11;

import java.awt.*;
import java.applet.*;

/*
  Created by baris_000 on 14-10-2016.
 */


        public class H11O4 extends Applet {
            public void init() {}

            public void paint(Graphics g) {
                int teller;
                int y = 0;


                for (teller = 0; teller < 11; teller++) {
                    int c = teller * 3;
                    y += 20;
                    g.drawString("" + c, y, 305);
                }
            }
        }
