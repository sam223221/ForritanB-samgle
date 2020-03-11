package fo.samgle;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        String Words = "Magnus er ein hora";
        JLabel text = new JLabel(Words);
        text.setFont(new Font("Verdana",1,20));



    }
}