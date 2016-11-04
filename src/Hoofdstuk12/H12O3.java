package Hoofdstuk12;


/*
  Created by baris_000 on 3-11-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class H12O3 extends Applet{
    private TextField[] tekstvak;
    private int[] getal;


    public void init() {

            tekstvak = new TextField[5];
            getal = new int[5];
        Button knop = new Button("Enter");
            knop.addActionListener(new listener());
            add(knop);

        for (int i = 0; i < tekstvak.length; i++) {
            TextField we = new TextField("", 7);
            tekstvak[i] = we;
            add(we);
            
        }
        
    }


    private class listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvak.length; i++) {
                String input = tekstvak[i].getText();
                getal[i] = Integer.parseInt(input);

            }

            Arrays.sort(getal);

            for (int i = 0; i < getal.length; i++) {
                tekstvak[i].setText(String.valueOf(getal[i]));
            }
        }
    }
}
