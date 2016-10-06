import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by baris_000 on 30-9-2016.
 */
public class H10Opdr2 extends Applet {
    int getal;
    int getal2;
    TextField tekstvak2;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";
        tekstvak2 = new TextField("", 5);
        tekstvak2.addActionListener(new VakListener());
        label = new Label("Geef uw leeftijd in en druk op enter");
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            String l;
            s = tekstvak.getText();
            l = tekstvak2.getText();
            getal = Integer.parseInt(s);
            getal2 = Integer.parseInt(l);
            if (getal < getal2) {
                tekst = "Grootste getal." + getal;
            }
            if (getal2 < getal) {
                tekst = "Grootste getal." + getal2;
            }
            repaint();


        }
    }
}
