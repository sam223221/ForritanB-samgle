package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jósef {
    public void Jósef(){
        JFrame f = new JFrame();
        f.setSize(500,500);

        JButton JumboBurgari = new JButton("Hey");
        JumboBurgari.setBounds(50,150,200,50);
        JumboBurgari.setFont(new Font("Verdana",3,17));
        JumboBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Hey");
            }});
        f.add(JumboBurgari);


    }
}
