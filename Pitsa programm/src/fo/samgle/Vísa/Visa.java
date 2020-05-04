package fo.samgle.Vísa;

import fo.samgle.Main;
import fo.samgle.ViewBase;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Visa extends ViewBase {

    String text = null;
    TextArea tekst = new TextArea(text);

        public Visa(){


            tekst.setBounds(600,200,200,400);
            add(tekst);



            setSize(new Dimension(900, 1000));
            setLayout(null);

        //listin
            JList list = new JList(Main.ListdataList);
            list.setBounds(50 , 150 , 500 , 750);
            Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
            list.setBorder(border);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            add(list);


        //Vísa
            JButton v = new JButton("Vísa");
            v.setBounds(600,600,200,70);
            v.setFont(new Font("Verdana",3,25));
            v.addActionListener(e -> {
                if(list.getSelectedIndex() !=-1) {
                    System.out.println("tekst");
                    System.out.println(Main.goymaBestidling);
                    text = Main.goymaBestidling.toString();
                }
            });
            add(v);




        //aftur
            JButton Aftur = new JButton("Aftur");
            Aftur.setBounds(600,700,200,70);
            Aftur.setFont(new Font("Verdana",3,17));
            Aftur.addActionListener(e -> {
                getMain().NavigateTo("Startsíða");
            });
            add(Aftur);


    }

}
