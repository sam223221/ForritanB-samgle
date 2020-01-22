package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;

    final int[] time = {6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
    int timi;
    int food= 10;
    int ganga = 20;


    private ActionListener button1Press;
    private ActionListener button2Press;
    private ActionListener button3Press;

    public Form() {
        frame = new JFrame();
        frame.setSize(620, 480);
        frame.setLayout(null);

        textField = new JTextField();
        textArea = new JTextArea();
    }

    public void Show() {


        button1Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timi++;
                food--;
                if (timi == 17){
                    timi=0;
                }
                if (ganga < 15){
                    food = food - 3;
                }
                ganga--;
                if(food <= 0 ){
                    Log("hundur tín er deyður");
                }
                String inputText = textField.getText();
                if (food > 0 ) {

                    Log("næsti tími er: " + time[timi] + " matur " + food   +   "  orka"  +   ganga);
                }
            }
        };

        button2Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (food > 0 && food < 20 ){
                    food++;
                    Log("Eta: "+ food);
                } else {
                    Log("full");
                }

                String inputText  = textField.getText();

            }
        };

        button3Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ganga == 30){
                    Log("for nógv orka ");
                    ganga--;
                }else{
                    ganga++;
                }
                String inputText  = textField.getText();
                Log("Ganga túr: " + ganga);
            }
        };

        AddTextField(new Rectangle(10, 10, 600, 25));
        AddButton("Næsti tími", new Rectangle(10, 35, 100, 25), button1Press);
        AddButton("Et", new Rectangle(120, 35, 100, 25), button2Press);
        AddButton("Gang", new Rectangle(230, 35, 100, 25), button3Press);
        AddTextArea(new Rectangle(10, 65, 600, 1000));
        frame.setVisible(true);
    }

    private void AddTextField(Rectangle position) {
        textField.setBounds(position);
        frame.add(textField);
    }

    private void AddButton(String caption, Rectangle rectangle, ActionListener actionListener) {
        JButton button = new JButton();
        button.setText(caption);
        button.setBounds(rectangle);
        button.addActionListener(actionListener);
        frame.add(button);
    }

    private void AddTextArea(Rectangle position) {
        textArea.setBounds(position);
        frame.add(textArea);
    }

    private void Log(String text) {
        textArea.append((text + "\n"));
    }



}
