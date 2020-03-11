package fo.samgle;


import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class Main {

    public static void main(String[] args) {





        Board panel = new Board();
        Frame frame = new Frame();

        frame.setVisible(true);
        frame.setSize(frame.W_frame,frame.H_frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setBackground(Color.BLACK);

        
        panel.add(text);

    }
}
