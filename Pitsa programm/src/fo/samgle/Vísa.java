package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Vísa extends ViewBase {

        public Vísa(){

            setSize(new Dimension(900, 1000));
            setLayout(null);

        //listin
            DefaultListModel dataList = new DefaultListModel();
            JList list = new JList(dataList);
            list.setBounds(50 , 150 , 500 , 750);
            Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
            list.setBorder(border);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            add(list);
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
