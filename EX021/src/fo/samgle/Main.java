package fo.samgle;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {

    public static void main(String[] args) {


        Frame frame = new Frame();
        Board panel = new Board();



        panel.setBackground(Color.BLACK);
        frame.setSize(panel.F_W,panel.F_H);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel.button1,BorderLayout.NORTH);
        frame.add(panel.button2,BorderLayout.SOUTH);

        panel.button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel.ingame = false;
                System.out.println("hettar riggar");
                new Board();
            }});


        panel.button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel.ingame = true;
                System.out.println("haleluja");
                new Board();
            }});
        frame.setVisible(true);

        frame.add(panel);



/*
        Board panel = new Board();
        Frame frame = new Frame();






        panel.add();
*/
    }

}
