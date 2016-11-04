package Hoofdstuk12;

/*
  Created by baris_000 on 1-11-2016.
 */

import java.applet.Applet;
import java.awt.*;

public class H12O2 extends Applet {
    private Button[] knop = new Button[25];

    public void init() {
        for (int k = 0; k < knop.length; k++) {
            knop[k] = new Button("Knop "+ (k+1));
            add(knop[k]);
        }
    }

}