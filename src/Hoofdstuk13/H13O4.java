package Hoofdstuk13;

        /*
  Created by baris_000 on 10-11-2016.
 */


import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13O4 extends Applet {

    private Color color = null;
    private Button red = new Button("Rode bakstenen");
    private Button gray = new Button("Grijze betonblokken");
    private int sz = 0;

    public void init() {
        add(red);
        red.addActionListener(new kl());
        add(gray);
        gray.addActionListener(new kp());
    }

    public void paint(Graphics g) {
        muur(g);
    }

    private void muur(Graphics g) {
        g.setColor(color);
        for (int iRow = 0; 2 + 10 * iRow < getHeight(); iRow++) {
            for (int iCol = 0; 2 + 52 * (iCol - 1) < getWidth(); iCol++) {
                if (iRow % 2 == 0) {
                    g.fillRect(sz * (2 + 52 * iCol), sz * (2 + 22 * iRow), sz * 50, sz * 20);
                } else {
                    g.fillRect(sz * (-25 + 52 * iCol), sz * (2 + 22 * iRow), sz * 50, sz * 20);
                }
            }
        }
    }

    private class kl implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            color = Color.red;
            sz = 1;
            repaint();
        }
    }

    private class kp implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            color = Color.gray;
            sz = 2;
            repaint();
        }
    }
}