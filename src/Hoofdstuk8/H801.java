import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H801 extends Applet {
    Button knop;
    Button knop2;
    String schermtekst;
    TextField tekstvak;
    Label label;

    public void init() {
        schermtekst = " ";
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        knop2 = new Button("Reset");
        KnopListener kp = new KnopListener2();
        knop2.addActionListener( kp );
        add(knop2);
        tekstvak = new TextField ("Klik op mij", 20);
        label = new Label("Type iets in het  tekstvakje");
        add(label);
        add(tekstvak);

    }

    public void paint (Graphics g) {
       g.drawString(schermtekst,50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e ) {
            schermtekst = "" + tekstvak.getText();
            repaint ();
        }
    }

    private class KnopListener2 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "";
            tekstvak.setText("");
            repaint();
        }
    }
}