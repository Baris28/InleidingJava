package Hoofdstuk12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
  Created by baris_000 on 4-11-2016.
 */

public class H12O5 extends Applet {

    private int[] getallen = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25 };
    private TextField tekstvak;
    private String string;
    private boolean gevonden;
    private int Regen = -1;

    public void init() {
        string = "";
        gevonden = false;
        tekstvak = new TextField("", 5);
        Button knop = new Button("Ok");
        knop.addActionListener(new Listener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("" + string, 125, 50);
    }

    private class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int zoeken = Integer.parseInt(tekstvak.getText());
            for (int teller = 0; teller < getallen.length && !gevonden; teller++) {
                Regen += 2;
                if (getallen[teller] == zoeken) {
                    gevonden = true;
                }
            }
            if (gevonden) {
                string = "De waarde " + Regen + " is gevonden.";
            } else {
                string = "De waarde is niet gevonden.";
            }
            Regen = -1;
            tekstvak.setText("");
            gevonden = false;
            repaint();
        }
    }
}