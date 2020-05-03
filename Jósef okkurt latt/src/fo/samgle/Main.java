package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);

        JButton hey = new JButton("Hey");
        hey.setBounds(50,150,200,50);
        hey.setFont(new Font("Verdana",3,17));
        hey.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Hey");
            }});
        f.add(hey);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
