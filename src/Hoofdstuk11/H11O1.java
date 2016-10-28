package Hoofdstuk11;
import java.awt.*;
import java.applet.*;
/*
  Created by baris_000 on 13-10-2016.
 */

public class H11O1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 1; teller < 11; teller++) {
            y += 20;
            g.drawLine(y , 50, y, 300 );
            g.drawString("" + teller, y, 315 );
        }
    }
}
