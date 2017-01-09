package Hoofdstuk14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;



/*
  Created by baris_000 on 21-11-2016.
 */



public class H14O3 extends Applet {


    int computerzet;
    int spelerzet;
    int smileys = 23;
    String winaar;
    Button knop;
    TextField tekstvak;
    Image afbeelding;
    Image afbeelding2;
    Image afbeelding3;
    boolean beurt = true;


    @Override
    public void init() {

        tekstvak = new TextField("",15);
        knop = new Button("Zet");

        add(tekstvak);
        add(knop);

        URL pad = H14O3.class.getResource("/resources/");
        afbeelding = getImage(pad, "smiley.png");
        afbeelding2 = getImage(pad, "");
        afbeelding3 = getImage(pad, "");
        tekstvak.addActionListener(new spelTextListener());
        knop.addActionListener(new spelTextListener());


    }

    @Override
    public void paint(Graphics g) {
        setSize(500,500);
        g.setColor(Color.blue);
        g.drawImage(afbeelding2, 55, 80, 100, 100, this);
        g.setColor(Color.black);
        if (smileys > 0) {
            int x = 50;
            int y = 50;

            for (int i = 0; i < smileys; i++) {
                g.drawImage(afbeelding, x, y, 55, 55, this);

                x += 55;
                if (i % 4 == 3) {
                    x = 50;
                    y += 55;
                }
            }
            g.drawString("Laatste zet speler " + spelerzet, 370, 300);
            g.drawString("Laatste zet computer " + computerzet, 370, 320);
        }
        else{
            g.drawString(winaar,20,100);
        }
        if(beurt == false){
        }
    }

    private int smileys() {
        int take = 0;
        double r;
        int r2;
        r = Math.random();
        r2 = (int) (r * 3 + 1);
        int spelerzet;
        spelerzet = smileys % 4;

        if (spelerzet == 0) {
            take = 3;
        }

        if (spelerzet == 1) {
            take = r2;
        }

        if (spelerzet == 2) {
            take = 1;
        }

        if (spelerzet == 3) {
            take = 2;
        }
        return take;
    }

    private class spelTextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String smiley = tekstvak.getText();
            int spelertussenstap = Integer.parseInt(smiley);

            if(spelertussenstap < 4 && spelertussenstap > 0) {

                spelerzet = spelertussenstap;
                smileys -= spelerzet;
                if (smileys < 1) {
                    winaar = "je hebt verloren";
                    URL pad = H14O3.class.getResource("/resources/");
                    afbeelding2 = getImage(pad, "smiley2.png");

                } else {

                    computerzet = smileys();
                    smileys -= computerzet;
                    if (smileys < 0) {
                        winaar = "je hebt gewonnen";
                        URL pad = H14O3.class.getResource("/resources/");
                        afbeelding2 = getImage(pad, "smiley3.png");
                    }

                }
            }
            else{
                beurt = false;
            }
            repaint();
        }
    }


}
