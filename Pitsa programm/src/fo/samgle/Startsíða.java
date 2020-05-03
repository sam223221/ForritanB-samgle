package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startsíða extends ViewBase{

    public  Startsíða(){
        //yvirskrift
        JLabel tekst = new JLabel("Pitsa 530");

        //Gera
        JButton Gera = new JButton("Gera");
        Gera.setBounds(350,450,200,100);
        Gera.setFont(new Font("Verdana",3,25));
        Gera.addActionListener(e -> {
            getMain().NavigateTo("Pitsa");
        });
        add(Gera);

        //Vísa
        JButton Vísa = new JButton("Vísa");
        Vísa.setBounds(350,600,200,100);
        Vísa.setFont(new Font("Verdana",3,25));
        Vísa.addActionListener(e -> {
            System.out.println("hellow");
            getMain().NavigateTo("Vísa");
        });
        add(Vísa);

        //Textfild
        tekst.setFont(new Font("Verdana",3,35));
        tekst.setBounds(350,100,200,200);
        add(tekst);

        //uppseting
        setLayout(null);
    }

}
