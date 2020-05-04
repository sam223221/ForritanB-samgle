package fo.samgle.Vísa;

import fo.samgle.Main;

import javax.swing.*;
import java.awt.*;

public class GrillVisa {

    public void GrillVisa(){
        JFrame f = new JFrame("Grill Vísari");
        String text = Main.goymaBestidling.toString();


        JLabel tekst = new JLabel(text);
        tekst.setFont(new Font("Verdana",3,35));
        tekst.setBounds(350,100,200,200);
        f.add(tekst);

        f.setSize(900,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}
