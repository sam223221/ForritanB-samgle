package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class broytt_grill {

    public void broytt_Grill(){


        JFrame f = new JFrame();

        f.setSize(900,500);
        f.setLayout(null);
        f.setVisible(true);

        //listi
        DefaultListModel BroyttDataList = new DefaultListModel();
        JList list = new JList(BroyttDataList);
        list.setBounds(660 , 20 , 200 , 275);
        Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
        list.setBorder(border);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        f.add(list);

        //Búffur
        JButton buffur = new JButton("buffur");
        buffur.setBounds(25,20,175,50);
        buffur.setFont(new Font("Verdana",3,17));
        buffur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("buffur");
                BroyttDataList.addElement("buffur");
            }});
        f.add(buffur);



        //Bacon B
        JButton BaconB = new JButton("Bacon Búff");
        BaconB.setBounds(25,90,175,50);
        BaconB.setFont(new Font("Verdana",3,17));
        BaconB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Bacon Búff");
                BroyttDataList.addElement("Bacon Búff");
            }});
        f.add(BaconB);


        //Kylling Búff
        JButton KyllingB = new JButton("Kylling Búff");
        KyllingB.setBounds(25,160,175,50);
        KyllingB.setFont(new Font("Verdana",3,17));
        KyllingB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Kylling Búff");
                BroyttDataList.addElement("Kylling Búff");
            }});
        f.add(KyllingB);


        //kál
        JButton kal = new JButton("kál");
        kal.setBounds(25,230,175,50);
        kal.setFont(new Font("Verdana",3,17));
        kal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("kál");
                BroyttDataList.addElement("kál");
            }});
        f.add(kal);


        //Reytt kál
        JButton reyttK = new JButton("Reytt kál");
        reyttK.setBounds(25,300,175,50);
        reyttK.setFont(new Font("Verdana",3,17));
        reyttK.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Reytt kál");
                BroyttDataList.addElement("Reytt kál");
            }});
        f.add(reyttK);


        //Leyk
        JButton Leyk = new JButton("Leyk");
        Leyk.setBounds(25,370,175,50);
        Leyk.setFont(new Font("Verdana",3,17));
        Leyk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Leyk");
                BroyttDataList.addElement("Leyk");
            }});
        f.add(Leyk);

        //Stoykt Leyk
        JButton StoyktL = new JButton("Stoykt Leyk");
        StoyktL.setBounds(225,20,175,50);
        StoyktL.setFont(new Font("Verdana",3,17));
        StoyktL.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Stoykt Leyk");
                BroyttDataList.addElement("Stoykt Leyk");
            }});
        f.add(StoyktL);



        //Agurk
        JButton Agurk = new JButton("Agurk");
        Agurk.setBounds(225,90,175,50);
        Agurk.setFont(new Font("Verdana",3,17));
        Agurk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Agurk");
                BroyttDataList.addElement("Agurk");
            }});
        f.add(Agurk);


        //Súlta Agurk
        JButton sultaA = new JButton("Súlta Agurk");
        sultaA.setBounds(225,160,175,50);
        sultaA.setFont(new Font("Verdana",3,17));
        sultaA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Súlta Agurk");
                BroyttDataList.addElement("Ost");
            }});
        f.add(sultaA);


        //Tomat
        JButton Tomat = new JButton("Tomat");
        Tomat.setBounds(225,230,175,50);
        Tomat.setFont(new Font("Verdana",3,17));
        Tomat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Tomat");
                BroyttDataList.addElement("Tomat");
            }});
        f.add(Tomat);


        //Ost
        JButton Ost = new JButton("Ost");
        Ost.setBounds(225,300,175,50);
        Ost.setFont(new Font("Verdana",3,17));
        Ost.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Ost");
                BroyttDataList.addElement("Ost");
            }});
        f.add(Ost);


        //1000 Islands
        JButton Islands = new JButton("1000 Islands");
        Islands.setBounds(225,370,175,50);
        Islands.setFont(new Font("Verdana",3,17));
        Islands.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("1000 Islands");
                BroyttDataList.addElement("1000 Islands");
            }});
        f.add(Islands);

        //creme fraiche
        JButton CreamF = new JButton("creme fraiche");
        CreamF.setBounds(450,20,175,50);
        CreamF.setFont(new Font("Verdana",3,17));
        CreamF.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("creme fraiche");
                BroyttDataList.addElement("creme fraiche");
            }});
        f.add(CreamF);



        //Chilli dressing
        JButton chilliD = new JButton("Chilli dressing");
        chilliD.setBounds(450,90,175,50);
        chilliD.setFont(new Font("Verdana",3,17));
        chilliD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Chilli dressing");
                BroyttDataList.addElement("Chilli dressing");
            }});
        f.add(chilliD);


        //hvítleyk Dressing
        JButton hvítleykD = new JButton("Ketjup");
        hvítleykD.setBounds(450,160,175,50);
        hvítleykD.setFont(new Font("Verdana",3,17));
        hvítleykD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Ketjup");
                BroyttDataList.addElement("Ketjup");
            }});
        f.add(hvítleykD);


        //BBQ
        JButton BBQ = new JButton("BBQ");
        BBQ.setBounds(450,230,175,50);
        BBQ.setFont(new Font("Verdana",3,17));
        BBQ.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("BBQ");
                BroyttDataList.addElement("BBQ");
            }});
        f.add(BBQ);


        //Bacon
        JButton Bacon = new JButton("Bacon");
        Bacon.setBounds(450,300,175,50);
        Bacon.setFont(new Font("Verdana",3,17));
        Bacon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Bacon");
                BroyttDataList.addElement("Bacon");
            }});
        f.add(Bacon);


        //salat
        JButton salat = new JButton("salat");
        salat.setBounds(450,370,175,50);
        salat.setFont(new Font("Verdana",3,17));
        salat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("salat");
                BroyttDataList.addElement("salat");
            }});
        f.add(salat);


        //Ligut
        JButton Ligut = new JButton("Ligut");
        Ligut.setBounds(685,370,175,50);
        Ligut.setFont(new Font("Verdana",3,17));
        Ligut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Ligut");
                for(int i = 0 ; i < BroyttDataList.size() ; i++){
                    //Main.bestidling.get(Pitsa.selected).toppings.toString().replace(i,BroyttDataList.get(i));
                }
                f.dispose();
            }});
        f.add(Ligut);


        //Strika
        JButton Strika = new JButton("Strika");
        Strika.setBounds(685,300,175,50);
        Strika.setFont(new Font("Verdana",3,17));
        Strika.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Strika");
                int selected = list.getSelectedIndex();
                if (selected != -1 ){
                    BroyttDataList.remove(selected);
                    System.out.println(selected);
                }
            }});
        f.add(Strika);
    }
}
