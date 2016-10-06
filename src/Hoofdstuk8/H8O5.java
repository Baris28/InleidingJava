import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H8O5 extends Applet {

    int a;
    int b;
    int c;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;
    Label label;
    Label label1;
    Label label2;
    TextField tekstvak;
    TextField tekstvak1;
    TextField tekstvak2;
    Button knop;

    public void init() {
        label = new Label("Jeroen");
        add(label);
        tekstvak = new TextField("", 20);
        add(tekstvak);
        label1 = new Label("Valerie");
        add(label1);
        tekstvak1 = new TextField("", 20);
        add(tekstvak1);
        label2 = new Label("Hans");
        add(label2);
        tekstvak2 = new TextField("", 20);
        add(tekstvak2);
        knop = new Button("Wijzig waardes");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        a = 60;
        b = 100;
        c = 80;

        uitkomst  =  a ;
        uitkomst2 =  b ;
        uitkomst3 =  c ;
    }

    public void paint(Graphics g) {
        setSize(700, 600);
        g.setColor(Color.cyan);
        g.fillRect(60, uitkomst - 300, 50, uitkomst);
        g.setColor(Color.yellow);
        g.fillRect(130, uitkomst2 - 300, 50, uitkomst2);
        g.setColor(Color.BLUE);
        g.fillRect(190, uitkomst3 - 300, 50, uitkomst3);
        g.setColor(Color.black);
        g.drawString(uitkomst + "kg", 60, 350);
        g.drawString(uitkomst2 + "kg", 130, 350);
        g.drawString(uitkomst3 + "kg", 190, 350);

    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e ) {
            String s = tekstvak.getText();
            String d = tekstvak1.getText();
            String f = tekstvak2.getText();
            uitkomst = Integer.parseInt( s );
            uitkomst2 = Integer.parseInt( d );
            uitkomst3 = Integer.parseInt( f );
            repaint();
        }
    }
}