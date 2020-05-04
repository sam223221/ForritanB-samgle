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
                BurgaraInfo JumboBurgari = new BurgaraInfo();
                JumboBurgari.BurgaraNavn = "JumboBurgari";
                JumboBurgari.Búffar = 2;
                JumboBurgari.Filla= new String[]{"Tomat" , "Agurk" , "Leyk" , "Kál" , "1000 Islands"};
                Main.dataList.addElement("Jumbo Burgari");
                Main.bestidling.add(JumboBurgari);
            }});
            add(JumboBurgari);

        //Big Burgari
        JButton BigBurgari  = new JButton("Big Burgari");
            BigBurgari.setBounds(50,210,200,50);
            BigBurgari.setFont(new Font("Verdana",3,17));
            BigBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Big Burgari");
                BurgaraInfo BigBurgari = new BurgaraInfo();
                BigBurgari.BurgaraNavn = "BigBurgari";
                BigBurgari.Búffar = 1;
                BigBurgari.Filla= new String[]{"Tomat", "Agurk" , "Leyk" , "Kál" , "1000 Islands"};
                Main.dataList.addElement("Big Burgari");
                Main.bestidling.add(BigBurgari);
            }});
            add(BigBurgari);

        //Cheese Burgari
        JButton CheeseBurgari = new JButton("Cheese Burgari");
            CheeseBurgari.setBounds(50,270,200,50);
            CheeseBurgari.setFont(new Font("Verdana",3,17));
            CheeseBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Cheese Burgari");
                BurgaraInfo CheeseBurgari = new BurgaraInfo();
                CheeseBurgari.BurgaraNavn = "CheeseBurgari";
                CheeseBurgari.Búffar = 1;
                CheeseBurgari.Filla= new String[]{"Tomat", "Agurk" , "Leyk" , "Kál" , "1000 Islands"};
                Main.dataList.addElement("Cheese Burgari");
                Main.bestidling.add(CheeseBurgari);
            }});
            add(CheeseBurgari);

        //Bacon Burgari
        JButton BaconBurgari = new JButton("Bacon Burgari");
            BaconBurgari.setBounds(50,330,200,50);
            BaconBurgari.setFont(new Font("Verdana",3,17));
            BaconBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Bacon Burgari");
                BurgaraInfo BaconBurgari = new BurgaraInfo();
                BaconBurgari.BurgaraNavn = "BaconBurgari";
                BaconBurgari.Búffar = 1;
                BaconBurgari.Filla= new String[]{"Tomat", "Agurk" , "Leyk" , "Kál" , "BBQ"};
                Main.dataList.addElement("Bacon Burgari");
                Main.bestidling.add(BaconBurgari);
            }});
            add(BaconBurgari);

        //Junior Burgari
        JButton JuniorBurgari = new JButton("Junior Burgari");
        JuniorBurgari.setBounds(50,390,200,50);
        JuniorBurgari.setFont(new Font("Verdana",3,17));
        JuniorBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Junior Burgari");
                BurgaraInfo JuniorBurgari = new BurgaraInfo();
                JuniorBurgari.BurgaraNavn = "JuniorBurgari";
                JuniorBurgari.Búffar = 1;
                JuniorBurgari.Filla= new String[]{"Ketjup " , "StoktanLeyk "};
                Main.dataList.addElement("Junior Burgari");
                Main.bestidling.add(JuniorBurgari);
            }});
            add(JuniorBurgari);

        //Búffsandwich
        JButton Búffsandwich = new JButton("Búffsandwich");
            Búffsandwich.setBounds(50,450,200,50);
            Búffsandwich.setFont(new Font("Verdana",3,17));
            Búffsandwich.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Búffsandwich");
                BurgaraInfo Búffsandwich = new BurgaraInfo();
                Búffsandwich.BurgaraNavn = "JumboBurgari";
                Búffsandwich.Búffar = 2;
                Búffsandwich.Filla= new String[]{"súlta Agurk" , "Reyttkál" , "soktan Leyk" , "Ketjup" , "Sinup"};
                Main.dataList.addElement("Miss Piggy");
                Main.bestidling.add(Búffsandwich);
            }});
            add(Búffsandwich);

        //Kyllinga burgari
        JButton KyllingaBurgari = new JButton("Kyllinga burgari");
            KyllingaBurgari.setBounds(50,510,200,50);
            KyllingaBurgari.setFont(new Font("Verdana",3,17));
            KyllingaBurgari.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Kyllinga burgari");
                BurgaraInfo KyllingaBurgari = new BurgaraInfo();
                KyllingaBurgari.BurgaraNavn = "KyllingaBurgari";
                KyllingaBurgari.Búffar = 1;
                KyllingaBurgari.Filla= new String[]{"Agurk" , "Leyk" , "Kál" , "Chilli Dressing"};
                Main.dataList.addElement("KyllingaBurgari");
                Main.bestidling.add(KyllingaBurgari);
            }});
            add(KyllingaBurgari);

        //Kylling og kips
        JButton KyllingKips = new JButton("Kylling og kips");
            KyllingKips.setBounds(50,570,200,50);
            KyllingKips.setFont(new Font("Verdana",3,17));
            KyllingKips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Kylling og kips");
                GrillInfo KyllingKips = new GrillInfo();
                KyllingKips.GrillNavn = "Kylling og kips";
                KyllingKips.Eyka = new String[] {""};
                Main.dataList.addElement("Kylling og Kips");
                Main.bestidling.add(KyllingKips);
            }});
            add(KyllingKips);

        //Fisk og Kips
        JButton FiskKips = new JButton("Fisk og Kips");
            FiskKips.setBounds(50,630,200,50);
            FiskKips.setFont(new Font("Verdana",3,17));
            FiskKips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Fisk og Kips");
                GrillInfo FiskKips = new GrillInfo();
                FiskKips.GrillNavn = "Fisk og Kips";
                FiskKips.Eyka = new String[] {""};
                Main.dataList.addElement("Fisk og Kips");
                Main.bestidling.add(FiskKips);
            }});
            add(FiskKips);

        //Nuggets
        JButton Nuggets = new JButton("Nuggets");
            Nuggets.setBounds(50,690,200,50);
            Nuggets.setFont(new Font("Verdana",3,17));
            Nuggets.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Nuggets");
                GrillInfo Nuggets = new GrillInfo();
                Nuggets.GrillNavn = "Nuggets";
                Nuggets.Eyka = new String[] {""};
                Main.dataList.addElement("Nuggets");
                Main.bestidling.add(Nuggets);
            }});
            add(Nuggets);

        //Kips
        JButton Kips = new JButton("Kips");
            Kips.setBounds(50,750,200,50);
            Kips.setFont(new Font("Verdana",3,17));
            Kips.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Kips");
                GrillInfo Kips = new GrillInfo();
                Kips.GrillNavn = "Kips";
                Kips.Eyka = new String[] {""};
                Main.dataList.addElement("Kips");
                Main.bestidling.add(Kips);
            }});
            add(Kips);

        //Broytt
        JButton Broytt = new JButton("broytt");
        Broytt.setBounds(600,500,200,70);
        Broytt.setFont(new Font("Verdana",3,17));
        Broytt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Broytt");
                BurgaraInfo burgaraInfo = new BurgaraInfo();
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
                BurgaraInfo burgaraInfo = new BurgaraInfo();
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
                System.out.println(Main.bestidling);
                Main.goymaBestidling.add(Main.bestidling);
                Main.dataList.removeAllElements();
                Main.bestidling.clear();
            }});
            add(Ligut);

    }
}
