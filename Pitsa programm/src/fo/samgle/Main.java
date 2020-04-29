package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();

    m.Startsíða();
    }

    public void Startsíða(){

        JFrame f = new JFrame("forsíða");

        JLabel tekst = new JLabel("Pitsa 530");
        Pitsa p = new Pitsa();
        Main m = new Main();

        //Gera
        JButton Gera = new JButton("Gera");
            Gera.setBounds(400,450,200,100);
            Gera.setFont(new Font("Verdana",3,25));
            Gera.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("Gera");
                    Pitsa p = new Pitsa();
                    p.pitsa();
                }});
            f.add(Gera);

        //Vísa
        JButton Vísa = new JButton("Vísa");
            Vísa.setBounds(400,600,200,100);
            Vísa.setFont(new Font("Verdana",3,25));
            Vísa.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("Vísa");
                    Vísa v = new Vísa();
                    v.Visa();
                }});
            f.add(Vísa);

        //Textfild
        tekst.setFont(new Font("Verdana",3,35));
        tekst.setBounds(400,100,200,200);
        f.add(tekst);

        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
