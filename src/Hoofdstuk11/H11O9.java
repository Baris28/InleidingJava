package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/*
  Created by baris_000 on 25-10-2016.
 */

public class H11O9 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        setBackground(Color.RED);
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, 20, 20);
            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, 20, 20);
            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, 20, 20);
            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, 20, 20);
            }
            x += 20;
        }
    }
}
