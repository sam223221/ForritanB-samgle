package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vísa {

    public void Visa(){
        JFrame f = new JFrame("forsíða");

        JButton Aftur = new JButton("Aftur");
        Aftur.setBounds(600,700,200,70);
        Aftur.setFont(new Font("Verdana",3,17));
        Aftur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("Aftur");
                Main m = new Main();
                m.Startsíða();

            }});
        f.add(Aftur);


        f.setSize(900,1000);
        f.setLayout(null);
        f.setVisible(true);

    }
}
