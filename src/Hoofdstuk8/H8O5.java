import java.awt.*;
import java.applet.*;
import java.awt.event.*;

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
        tekstvak = new TextField("", 20);
        add(tekstvak1);
        label2 = new Label("Hans");
        add(label);
        tekstvak2 = new TextField("", 20);
        add(tekstvak2);
        knop = new Button("Wijzig waardes");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        a = 20;
        b = 60;
        c = 60;

        uitkomst = a * 2;
        uitkomst2 = b * 2;
        uitkomst3 = c * 2;
    }

    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(60, 350, 50, -uitkomst);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(130, 350, 50, -uitkomst2);
        g.setColor(Color.GREEN);
        g.fillRect(190, 350, 50, -uitkomst3);
        g.setColor(Color.black);
        g.drawString(uitkomst + "kg", 60, 365);
        g.drawString(uitkomst2 + "kg", 130, 365);
        g.drawString(uitkomst3 + "kg", 190, 365);

    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            String d = tekstvak1.getText();
            String f = tekstvak2.getText();
            uitkomst = Integer.parseInt(s);
            uitkomst2 = Integer.parseInt(d);
            uitkomst3 = Integer.parseInt(f);
            repaint();
        }
    }
}