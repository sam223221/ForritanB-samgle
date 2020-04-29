package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grill {


    public void Grill(){
        JFrame f = new JFrame();

            //Jumbo Burgari
        JButton Jumbo_Burgari = new JButton("Jumbo Burgari");
            Jumbo_Burgari.setBounds(50,150,200,50);
            Jumbo_Burgari.setFont(new Font("Verdana",3,17));
            Jumbo_Burgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
            f.add(Jumbo_Burgari);

        //Big Burgari
        JButton Big_burgari  = new JButton("Big Burgari");
            Big_burgari.setBounds(50,210,200,50);
            Big_burgari.setFont(new Font("Verdana",3,17));
            Big_burgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Big Burgari"); }});
            f.add(Big_burgari);

        //Cheese Burgari
        JButton Cheese_Burgari = new JButton("Cheese Burgari");
            Cheese_Burgari.setBounds(50,270,200,50);
            Cheese_Burgari.setFont(new Font("Verdana",3,17));
            Cheese_Burgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Cheese Burgari"); }});
            f.add(Cheese_Burgari);

        //Bacon Burgari
        JButton Bacon_Burgari = new JButton("Bacon Burgari");
            Bacon_Burgari.setBounds(50,330,200,50);
            Bacon_Burgari.setFont(new Font("Verdana",3,17));
            Bacon_Burgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Bacon Burgari"); }});
            f.add(Bacon_Burgari);

        //Junior Burgari
        JButton Junior_Burgari = new JButton("Junior Burgari");
            Junior_Burgari.setBounds(50,390,200,50);
            Junior_Burgari.setFont(new Font("Verdana",3,17));
            Junior_Burgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Junior Burgari"); }});
            f.add(Junior_Burgari);

        //Búffsandwich
        JButton Búffsandwich = new JButton("Búffsandwich");
            Búffsandwich.setBounds(50,450,200,50);
            Búffsandwich.setFont(new Font("Verdana",3,17));
            Búffsandwich.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Búffsandwich"); }});
            f.add(Búffsandwich);

        //Kyllinga burgari
        JButton Kyllinga_burgari = new JButton("Kyllinga burgari");
            Kyllinga_burgari.setBounds(50,510,200,50);
            Kyllinga_burgari.setFont(new Font("Verdana",3,17));
            Kyllinga_burgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Kyllinga burgari"); }});
            f.add(Kyllinga_burgari);

        //Kylling og kips
        JButton Kylling_kips = new JButton("Kylling og kips");
            Kylling_kips.setBounds(50,570,200,50);
            Kylling_kips.setFont(new Font("Verdana",3,17));
            Kylling_kips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Kylling og kips"); }});
            f.add(Kylling_kips);

        //Fisk og Kips
        JButton Fisk_Kips = new JButton("Fisk og Kips");
            Fisk_Kips.setBounds(50,630,200,50);
            Fisk_Kips.setFont(new Font("Verdana",3,17));
            Fisk_Kips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Fisk og Kips"); }});
            f.add(Fisk_Kips);

        //Nuggets
        JButton Nuggets = new JButton("Nuggets");
            Nuggets.setBounds(50,690,200,50);
            Nuggets.setFont(new Font("Verdana",3,17));
            Nuggets.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Nuggets"); }});
            f.add(Nuggets);

        //Kips
        JButton Kips = new JButton("Kips");
            Kips.setBounds(50,750,200,50);
            Kips.setFont(new Font("Verdana",3,17));
            Kips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Kips"); }});
            f.add(Kips);

        //Broytt
        JButton Broytt = new JButton("broytt");
        Broytt.setBounds(600,500,200,70);
        Broytt.setFont(new Font("Verdana",3,17));
        Broytt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Broytt");
                broytt_grill bp = new broytt_grill();
                bp.broytt_Grill();
            }});
        f.add(Broytt);

        //Pitsa
        JButton pitsa = new JButton("Pitsa");
            pitsa.setBounds(600,600,200,70);
            pitsa.setFont(new Font("Verdana",3,17));
            pitsa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Pitsa");
                Pitsa p = new Pitsa();
                p.pitsa();
            }});
            f.add(pitsa);

        //Strika
        JButton Strika = new JButton("Strika");
            Strika.setBounds(600,700,200,70);
            Strika.setFont(new Font("Verdana",3,17));
            Strika.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Strika"); }});
            f.add(Strika);

        //Ligut
        JButton Ligut = new JButton("Ligut");
            Ligut.setBounds(600,800,200,70);
            Ligut.setFont(new Font("Verdana",3,17));
            Ligut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Ligut");
                Main m = new Main();
                m.Startsíða();
            }});
            f.add(Ligut);


    //listin
    String text = "Margarita";
        JLabel listi = new JLabel(text);
        listi.setBounds(600,50,200,400);
    Border border = BorderFactory.createLineBorder(Color.BLUE, 5);

    //upsetanin
        f.add(listi);
        f.setSize(900,1000);
        f.setLayout(null);
        f.setVisible(true);

    }
}
