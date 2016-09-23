import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8O4 extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    String schermtekst;
    TextField tekstvak;
    TextField tekstvak2;
    double btw;
    double uitkomst;


    public void init() {
        schermtekst = " ";
        knop = new Button("/");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        knop2 = new Button("*");
        KnopListener KFC = new KnopListener2();
        knop2.addActionListener(KFC);
        add(knop2);
        knop3 = new Button("-");
        KnopListener MCD = new KnopListener3();
        knop3.addActionListener(MCD);
        add(knop3);
        knop4 = new Button("+");
        KnopListener BK = new KnopListener4();
        knop4.addActionListener(BK);
        add(knop4);
        tekstvak = new TextField("", 30);
        add(tekstvak);
        tekstvak2 = new TextField("", 30);
        add(tekstvak2);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            String KFC = tekstvak2.getText();
            btw = Double.parseDouble(KFC);
            uitkomst = Double.parseDouble(s) / btw;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("" );
            repaint();
        }
    }

    private class KnopListener2 extends KnopListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            String KFC = tekstvak2.getText();
            btw = Double.parseDouble(KFC);
            uitkomst = Double.parseDouble(s) * btw;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }

    private class KnopListener3 extends KnopListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            String KFC = tekstvak2.getText();
            btw = Double.parseDouble(KFC);
            uitkomst = Double.parseDouble(s) - btw;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("" + btw);
            repaint();

          }
        }

    private class KnopListener4 extends KnopListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            String KFC = tekstvak2.getText();
            btw = Double.parseDouble(KFC);
            uitkomst = Double.parseDouble(s) + btw;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("" );
            repaint();
        }
    }
}

