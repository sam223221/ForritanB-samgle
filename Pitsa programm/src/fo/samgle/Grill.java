package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grill extends ViewBase {

    public Grill(){

        //uppseting
        setSize(new Dimension(900, 1000));
        setLayout(null);



        //listin
            JList list = new JList(Main.dataList);
            list.setBounds(600 , 150 , 200 , 300);
            Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
            list.setBorder(border);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            add(list);

            //Jumbo Burgari
        JButton JumboBurgari = new JButton("Jumbo Burgari");
            JumboBurgari.setBounds(50,150,200,50);
            JumboBurgari.setFont(new Font("Verdana",3,17));
            JumboBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Jumbo Burgari");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Jumbo Burgari");
            }});
            add(JumboBurgari);

        //Big Burgari
        JButton BigBurgari  = new JButton("Big Burgari");
            BigBurgari.setBounds(50,210,200,50);
            BigBurgari.setFont(new Font("Verdana",3,17));
            BigBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Big Burgari");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Big Burgari");
            }});
            add(BigBurgari);

        //Cheese Burgari
        JButton CheeseBurgari = new JButton("Cheese Burgari");
            CheeseBurgari.setBounds(50,270,200,50);
            CheeseBurgari.setFont(new Font("Verdana",3,17));
            CheeseBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Cheese Burgari");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Cheese Burgari");
            }});
            add(CheeseBurgari);

        //Bacon Burgari
        JButton BaconBurgari = new JButton("Bacon Burgari");
            BaconBurgari.setBounds(50,330,200,50);
            BaconBurgari.setFont(new Font("Verdana",3,17));
            BaconBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Bacon Burgari");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Bacon Burgari");
            }});
            add(BaconBurgari);

        //Junior Burgari
        JButton JuniorBurgari = new JButton("Junior Burgari");
        JuniorBurgari.setBounds(50,390,200,50);
        JuniorBurgari.setFont(new Font("Verdana",3,17));
        JuniorBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Junior Burgari");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Junior Burgari");
            }});
            add(JuniorBurgari);

        //Búffsandwich
        JButton Búffsandwich = new JButton("Búffsandwich");
            Búffsandwich.setBounds(50,450,200,50);
            Búffsandwich.setFont(new Font("Verdana",3,17));
            Búffsandwich.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Búffsandwich");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Miss Piggy");
            }});
            add(Búffsandwich);

        //Kyllinga burgari
        JButton KyllingaBurgari = new JButton("Kyllinga burgari");
            KyllingaBurgari.setBounds(50,510,200,50);
            KyllingaBurgari.setFont(new Font("Verdana",3,17));
            KyllingaBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Kyllinga burgari");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("KyllingaBurgari");
            }});
            add(KyllingaBurgari);

        //Kylling og kips
        JButton KyllingKips = new JButton("Kylling og kips");
            KyllingKips.setBounds(50,570,200,50);
            KyllingKips.setFont(new Font("Verdana",3,17));
            KyllingKips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Kylling og kips");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Kylling og Kips");
            }});
            add(KyllingKips);

        //Fisk og Kips
        JButton FiskKips = new JButton("Fisk og Kips");
            FiskKips.setBounds(50,630,200,50);
            FiskKips.setFont(new Font("Verdana",3,17));
            FiskKips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Fisk og Kips");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Fisk og Kips");
            }});
            add(FiskKips);

        //Nuggets
        JButton Nuggets = new JButton("Nuggets");
            Nuggets.setBounds(50,690,200,50);
            Nuggets.setFont(new Font("Verdana",3,17));
            Nuggets.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Nuggets");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Nuggets");
            }});
            add(Nuggets);

        //Kips
        JButton Kips = new JButton("Kips");
            Kips.setBounds(50,750,200,50);
            Kips.setFont(new Font("Verdana",3,17));
            Kips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Kips");
                GrillInfo grillInfo = new GrillInfo();
                Main.dataList.addElement("Kips");
            }});
            add(Kips);

        //Broytt
        JButton Broytt = new JButton("broytt");
        Broytt.setBounds(600,500,200,70);
        Broytt.setFont(new Font("Verdana",3,17));
        Broytt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Broytt");
                GrillInfo grillInfo = new GrillInfo();
                broytt_grill bp = new broytt_grill();
                bp.broytt_Grill();
            }});
        add(Broytt);

        //Pitsa
        JButton pitsa = new JButton("Pitsa");
            pitsa.setBounds(600,600,200,70);
            pitsa.setFont(new Font("Verdana",3,17));
            pitsa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Pitsa");
                GrillInfo grillInfo = new GrillInfo();
                getMain().NavigateTo("Pitsa");
            }});
            add(pitsa);

        //Strika
        JButton Strika = new JButton("Strika");
            Strika.setBounds(600,700,200,70);
            Strika.setFont(new Font("Verdana",3,17));
            Strika.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int selected = list.getSelectedIndex();
                if (selected != -1 ){
                    Main.dataList.remove(selected);
                    System.out.println(selected);
                    System.out.println(selected);
                }
            }});
            add(Strika);

        //Ligut
        JButton Ligut = new JButton("Ligut");
            Ligut.setBounds(600,800,200,70);
            Ligut.setFont(new Font("Verdana",3,17));
            Ligut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Ligut");
                getMain().NavigateTo("Startsíða");
                Main.dataList.removeAllElements();
                Main.bestidling.clear();
            }});
            add(Ligut);

    }
}
