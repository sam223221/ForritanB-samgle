package fo.samgle;

import fo.samgle.Vísa.OrderTjekStart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startsíða extends ViewBase{

    int j = 1;
    OrderTjekStart orderTjek = new OrderTjekStart();

    public  Startsíða(){
        //yvirskrift
        JLabel tekst = new JLabel("Pitsa 530");

        //Gera
        JButton Gera = new JButton("Gera");
        Gera.setBounds(350,450,200,100);
        Gera.setFont(new Font("Verdana",3,25));
        Gera.addActionListener(e -> {
            Main.ListdataList.addElement("Ordri " + j);
            j++;
            getMain().NavigateTo("Pitsa");
            Main.bestidling.clear();
            Main.bestidling.add(orderTjek);
        });
        add(Gera);

        //Vísa
        JButton v = new JButton("Vísa");
        v.setBounds(350,600,200,100);
        v.setFont(new Font("Verdana",3,25));
        v.addActionListener(e -> {
            getMain().NavigateTo("Vísa");
        });
        add(v);

        //Textfild
        tekst.setFont(new Font("Verdana",3,35));
        tekst.setBounds(350,100,200,200);
        add(tekst);

        //uppseting
        setLayout(null);
    }
}
