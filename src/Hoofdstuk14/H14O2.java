package Hoofdstuk14;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

/*
  Created by baris_000 on 14-11-2016.
 */
public class H14O2 extends Applet {

    private int kaartDelen;
    String[] p = {"Harten", "Schoppen","Klaver","Ruiten"};
    String[] r = {" Twee"," Drie"," Vier"," Vijf"," Zes"," Zeven"," Acht"," Negen"," Tien"," Vrouw"," Boer"," Heer"," Aas"};
    String[] deck;
    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;
    int kaarten;


    public void init() {


        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];


        deck = new String[52];
        Double r = Math.random();
        kaartDelen = (int) (r * 52);

        int index = 0;
        for (int i = 0; i < p.length; i++) {
            String kaart = p[i];
            for (int j = 0; j < this.r.length; j++) {
                deck[index] = p[i] + this.r[j];
                index += 1;
            }
        }


        for (int i = 0; i <13 ; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }

    }
    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];


        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    public void paint(Graphics g) {
        double r = Math.random();
        kaarten = (int)(r * deck.length );
        for (int i = 0; i <13 ; i++) {
            int y = 100;
            g.drawString("Speler 1", 50, 40);
            g.drawString(speler1[i],50,y + 20 *i);
            g.drawString("Speler 2", 250, 40);
            g.drawString(speler2[i],250,y + 20 *i);
            g.drawString("Speler 3", 450, 40);
            g.drawString(speler3[i],450,y + 20 *i);
            g.drawString("Speler 4", 650, 40);
            g.drawString(speler4[i],650,y + 20 *i);
        }

    }
}