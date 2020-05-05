package fo.samgle.Vísa;

import fo.samgle.Main;
import fo.samgle.ViewBase;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visa extends ViewBase {

    private JTextArea textArea = new JTextArea();
    private JScrollPane scrollPane;

        public Visa(){

            AddTextArea();




            setSize(new Dimension(900, 1000));
            setLayout(null);

        //listin
            JList list = new JList(Main.ListdataList);
            list.setBounds(550,150,300,400);
            Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
            list.setBorder(border);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            add(list);


        //Vísa
            JButton v = new JButton("Vísa");
            v.setBounds(600,600,200,70);
            v.setFont(new Font("Verdana",3,25));
            v.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                if(list.getSelectedIndex() !=-1) {
                    String inputText  = Main.goymaBestidling.get(list.getSelectedIndex()).toString();
                    Log(inputText);
                }
            }});
            add(v);
        //Strika
            JButton Strika = new JButton("Strika");
            Strika.setBounds(600,800,200,70);
            Strika.setFont(new Font("Verdana",3,17));
            Strika.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int selected = list.getSelectedIndex();
                    if (selected != -1 ){
                        Main.ListdataList.remove(selected);
                        Main.goymaBestidling.remove(selected);
                    }
                }});
            add(Strika);



        //aftur
            JButton Aftur = new JButton("Aftur");
            Aftur.setBounds(600,700,200,70);
            Aftur.setFont(new Font("Verdana",3,17));
            Aftur.addActionListener(e -> {
                getMain().NavigateTo("Startsíða");
            });
            add(Aftur);


    }

    private void AddTextArea() {
        Font font = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        textArea.setFont(font);
        textArea.setForeground(Color.LIGHT_GRAY);
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setCaretColor(Color.LIGHT_GRAY);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        scrollPane.setBounds(50 , 150 , 500 , 750);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void Log(String text) {
        textArea.append((text + "\n"));
    }
}
