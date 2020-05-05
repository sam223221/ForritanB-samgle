package fo.samgle.Vísa;

import fo.samgle.Main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PitsaVisa extends JFrame {

    private JTextArea textArea = new JTextArea();
    private JScrollPane scrollPane;

    public void PitsaVísa() {
        JFrame f = new JFrame("Pitsa Vísari");

        AddTextArea();

        JList list = new JList(Main.ListdataList);
        list.setBounds(700,150,100,400);
        Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
        list.setBorder(border);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        f.add(list);

        //Vísa
        JButton v = new JButton("Vísa");
        v.setBounds(700,600,100,70);
        v.setFont(new Font("Verdana",3,25));
        v.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(list.getSelectedIndex() !=-1) {
                    String inputText  = Main.goymaBestidling.get(list.getSelectedIndex()).toString();
                    Log(inputText);
                }
            }});
        f.add(v);

        f.add(scrollPane, BorderLayout.CENTER);
        f.setSize(900,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
        private void AddTextArea() {
            Font font = new Font(Font.MONOSPACED, Font.PLAIN, 12);
            textArea.setFont(font);
            textArea.setForeground(Color.LIGHT_GRAY);
            textArea.setBackground(Color.DARK_GRAY);
            textArea.setCaretColor(Color.LIGHT_GRAY);

            scrollPane = new JScrollPane(textArea);
            scrollPane.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
            scrollPane.setBounds(50 , 150 , 600 , 750);
        }

        private void Log(String text) {
            textArea.append((text + "\n"));
        }
        }