import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Opdr5 extends Applet {
    TextField tekstvak;
    Label label;
    TextField tekstvak2;
    String s, tekst;
    double cijfer;
    String d, tekst2;
    double cijfer2;
    double uitkomst;
    String l, tekst3;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        label = new Label("Type het cijfer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        tekst = "";
        tekst2 = "";
        tekst3 = "";
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
        g.drawString(tekst2, 50, 70);
        g.drawString("gemiddelde is:" + uitkomst, 50, 80);
        g.drawString(tekst3, 50,  90); }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            d = tekstvak2.getText();
            cijfer2 = Double.parseDouble(d);
             uitkomst = (cijfer + cijfer2) / 2;
            if (cijfer > 5.4) {
                tekst = "Voldoende.";
            } else {
                tekst = "Onvoldoende.";
            }
            if (cijfer2 > 5.4) {
                tekst2 = "Voldoende.";
            } else {
                tekst2 = "Onvoldoende.";
            }
            if (uitkomst > 5.49) {
                tekst3 = "Geslaagd";
            } else {
                tekst3 = "Gezakt";
            }
            repaint();
        }
    }
}