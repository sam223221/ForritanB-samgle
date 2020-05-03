package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class broytt_grill {

    public void broytt_Grill(){


        JFrame f = new JFrame();

        f.setSize(900,500);
        f.setLayout(null);
        f.setVisible(true);

        //Búffur
        JButton buffur = new JButton("buffur");
        buffur.setBounds(25,20,175,50);
        buffur.setFont(new Font("Verdana",3,17));
        buffur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(buffur);



        //Bacon B
        JButton BaconB = new JButton("Bacon Búff");
        BaconB.setBounds(25,90,175,50);
        BaconB.setFont(new Font("Verdana",3,17));
        BaconB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(BaconB);


        //Kylling Búff
        JButton KyllingB = new JButton("Kylling Búff");
        KyllingB.setBounds(25,160,175,50);
        KyllingB.setFont(new Font("Verdana",3,17));
        KyllingB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(KyllingB);


        //kál
        JButton kal = new JButton("kál");
        kal.setBounds(25,230,175,50);
        kal.setFont(new Font("Verdana",3,17));
        kal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(kal);


        //Reytt kál
        JButton reyttK = new JButton("Reytt kál");
        reyttK.setBounds(25,300,175,50);
        reyttK.setFont(new Font("Verdana",3,17));
        reyttK.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(reyttK);


        //Leyk
        JButton Leyk = new JButton("Leyk");
        Leyk.setBounds(25,370,175,50);
        Leyk.setFont(new Font("Verdana",3,17));
        Leyk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Leyk);

        //Stoykt Leyk
        JButton StoyktL = new JButton("Stoykt Leyk");
        StoyktL.setBounds(225,20,175,50);
        StoyktL.setFont(new Font("Verdana",3,17));
        StoyktL.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(StoyktL);



        //Agurk
        JButton Agurk = new JButton("Agurk");
        Agurk.setBounds(225,90,175,50);
        Agurk.setFont(new Font("Verdana",3,17));
        Agurk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Agurk);


        //Súlta Agurk
        JButton sultaA = new JButton("Súlta Agurk");
        sultaA.setBounds(225,160,175,50);
        sultaA.setFont(new Font("Verdana",3,17));
        sultaA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(sultaA);


        //Tomat
        JButton Tomat = new JButton("Tomat");
        Tomat.setBounds(225,230,175,50);
        Tomat.setFont(new Font("Verdana",3,17));
        Tomat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Tomat"); }});
        f.add(Tomat);


        //Ost
        JButton Ost = new JButton("Ost");
        Ost.setBounds(225,300,175,50);
        Ost.setFont(new Font("Verdana",3,17));
        Ost.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Ost"); }});
        f.add(Ost);


        //1000 Islands
        JButton Islands = new JButton("1000 Islands");
        Islands.setBounds(225,370,175,50);
        Islands.setFont(new Font("Verdana",3,17));
        Islands.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Islands);

        //Cream Fresh
        JButton CreamF = new JButton("Cream Fresh");
        CreamF.setBounds(450,20,175,50);
        CreamF.setFont(new Font("Verdana",3,17));
        CreamF.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(CreamF);



        //Chilli dressing
        JButton chilliD = new JButton("Chilli dressing");
        chilliD.setBounds(450,90,175,50);
        chilliD.setFont(new Font("Verdana",3,17));
        chilliD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("chilliD"); }});
        f.add(chilliD);


        //hvítleyk Dressing
        JButton hvítleykD = new JButton("hvítleyk Dressing");
        hvítleykD.setBounds(450,160,175,50);
        hvítleykD.setFont(new Font("Verdana",3,17));
        hvítleykD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(hvítleykD);


        //BBQ
        JButton BBQ = new JButton("BBQ");
        BBQ.setBounds(450,230,175,50);
        BBQ.setFont(new Font("Verdana",3,17));
        BBQ.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("BBQ"); }});
        f.add(BBQ);


        //Bacon
        JButton Bacon = new JButton("Bacon");
        Bacon.setBounds(450,300,175,50);
        Bacon.setFont(new Font("Verdana",3,17));
        Bacon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Bacon"); }});
        f.add(Bacon);


        //salat
        JButton salat = new JButton("salat");
        salat.setBounds(450,370,175,50);
        salat.setFont(new Font("Verdana",3,17));
        salat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("salat"); }});
        f.add(salat);


        //Ligut
        JButton Ligut = new JButton("Ligut");
        Ligut.setBounds(685,370,175,50);
        Ligut.setFont(new Font("Verdana",3,17));
        Ligut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Ligut");

            }});
        f.add(Ligut);


        //av
        JButton av = new JButton("av");
        av.setBounds(685,300,175,50);
        av.setFont(new Font("Verdana",3,17));
        av.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("av");
            }});
        f.add(av);


        //á
        JButton a = new JButton("á");
        a.setBounds(685,230,175,50);
        a.setFont(new Font("Verdana",3,17));
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("a");
            }});
        f.add(a);
    }
}
