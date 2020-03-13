package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import javax.swing.JButton;


public class Board extends JPanel {

String text = "hey John";

    public Integer F_W = 400;
    public Integer F_H = 300;
    public boolean ingame;
    Integer DELAY = 15;

    JButton button1 = new JButton("EndGame");
    JButton button2 = new JButton("StartGame");

    Date d = new Date();
    String dateString = d.toString();
    Timer timer = new Timer();
    
    public Board(){
        initBoard();
    }

    private void initBoard(){


        timer.start();
        ingame = true;
        inGame();
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (ingame) {

            drawObjects(g);

        } else {

            drawGameOver(g);
        }

        Toolkit.getDefaultToolkit().sync();
    }





private void drawGameOver(Graphics g){
    String msg = "Game Over";
    Font small = new Font("Arial", Font.BOLD, 14);
    FontMetrics fm = getFontMetrics(small);

    g.setColor(Color.white);
    g.setFont(small);
    g.drawString(msg, (F_W - fm.stringWidth(msg)) / 2,
            F_H / 2);

}

    public void drawObjects(Graphics g) {

        g.setColor(Color.YELLOW);
        g.drawString(text,F_W/2,F_H/2);

        g.drawString(dateString,F_W/2,F_H/2+40);
    }
    private void inGame() {

        if (!ingame) {
            timer.stop();
        }
    }
}