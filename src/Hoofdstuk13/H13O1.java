package Hoofdstuk13;


/*
  Created by baris_000 on 7-11-2016.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13O1 extends Applet {

    private String tekst = "";

    public void init() {
        setSize(500, 500);
        knop();
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 200, 300);
    }

    private void knop() {
        Color[] colors = {Color.red, Color.pink, Color.magenta, Color.yellow, Color.orange};
        String[] strings = {"Rood", "Roze", "Paars", "Geel", "oranje"};
        Button[] buttons = new Button[colors.length];
        for (int i = 0; i < colors.length; i++) {
            buttons[i] = new Button(strings[i]);
            add(buttons[i]);
            buttons[i].addActionListener(new kl());
            buttons[i].setBackground(colors[i]);
        }
    }

    private class kl implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button knop = (Button) e.getSource();
            setBackground(knop.getBackground());
            tekst = knop.getLabel();
            repaint();
        }
    }
}