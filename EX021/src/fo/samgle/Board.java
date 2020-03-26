package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;


public class Board extends JPanel implements ActionListener {




    public Integer F_W = 400;
    public Integer F_H = 300;
    public boolean ingame;
    private Timer timer ;
    private Integer DELAY = 1000;


    JButton button1 = new JButton("EndGame");
    JButton button2 = new JButton("StartGame");

    CurrentTimeSprite CurrentTimeSprite = new CurrentTimeSprite();


    public Board(){

        initBoard();
    }

    private void initBoard(){

        timer = new Timer(DELAY,(ActionListener)this);
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
    g.drawString(msg, (F_W - fm.stringWidth(msg)) / 2, F_H / 2);

}

    public void drawObjects(Graphics g) {

        Font x = new Font("Calibri", Font.BOLD, 20);
        Integer xc =  CurrentTimeSprite.x = (new Random()).nextInt(400);
        Integer yc =  CurrentTimeSprite.y = (new Random()).nextInt(400);

        g.setColor(Color.GREEN);
        g.setFont(x);
        g.drawString(CurrentTimeSprite.getCurrentTime(),xc, yc);


    }
    private void inGame() {

        if (!ingame) {
        timer.stop();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
            repaint();
    }
}