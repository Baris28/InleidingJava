import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8O3 extends Applet {
    Button knop;
    Label label;
    String schermtekst;
    TextField tekstvak;
    double btw;
    double uitkomst;


    public void init() {
        schermtekst = " ";
        label = new Label("Getal: ");
        add(label);
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        tekstvak = new TextField("", 30);
        add(tekstvak);


    }

    public void paint(Graphics g) {
        g.drawString("BTW + uitkomst : " + uitkomst, 70 , 90);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            btw = Double.parseDouble( s ) / 100 * 21;
            uitkomst = Double.parseDouble( s ) + btw;
            repaint();
        }
    }

}
