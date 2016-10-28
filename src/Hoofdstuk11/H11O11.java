package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
  Created by baris_000 on 28-10-2016.
 */

public class H11O11 extends Applet {
    private Button knop = new Button("Enter");
    private int kop;


    public void init() {
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
    }

    public void paint(Graphics g) {
        setBackground(Color.RED);
        setSize(500,400);
        int teller;
        int y = 0;


        for (teller = 1; teller < 11; teller++) {
            int c = teller * kop;
            y += 20;
            g.drawString(teller + " x " + kop + " = " + c, 305, y);
        }
    }

    private class KnopListener implements ActionListener {

        public void actionPerformed( ActionEvent e ) {
            kop += 1;
            if ( kop > 10 ) {
                kop = 1;
                repaint();
            }
            repaint();
        }
    }
}