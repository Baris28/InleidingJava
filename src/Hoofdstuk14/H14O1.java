package Hoofdstuk14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
  Created by baris_000 on 14-11-2016.
 */


public class H14O1 extends Applet {
    private Button knop = new Button();
    private String r;
    private String[] p = {"Klaver", "Ruiten", "Harten", "Schoppen"};
    private String[] l = {"Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven",
            "Acht", "Negen", "Tien", "Boer", "Aas", "Vrouw", "Heer"};

    public void init() {
        knop.setLabel( "Deel kaart" );
        r = "";
        knop.addActionListener(new knop());
        add(knop);
    }

    public void paint(Graphics g) {
        setSize(300,300);
        g.drawString("" + r, 50, 60 );
    }

    private class knop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String m = p[(int) (Math.random()* p.length)];
            String z = l[(int) (Math.random()* l.length)];
            r = m + " " + z;
            repaint();
        }
    }
}
