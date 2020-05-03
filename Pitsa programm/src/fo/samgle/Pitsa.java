package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pitsa extends ViewBase {

public Integer select;
public Pitsa(){

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

    //Margarita
    JButton Margarita = new JButton("01 Margarita");
        Margarita.setBounds(50,150,200,50);
        Margarita.setFont(new Font("Verdana",3,17));
        Margarita.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Margarita");
        PitsaInfo margarita = new PitsaInfo();
        margarita.pitsaNavn = "Margarita";
        margarita.doygg = "Medium";
        margarita.pitsasós = "Pitsasós";
        margarita.toppings = new String[]{"Ost"};
        Main.bestidling.add(margarita);
        Main.dataList.addElement("Margarita");
        }});
        add(Margarita);


    //Billy the kid
    JButton Billy_the_kid  = new JButton("02 Billy the kid");
        Billy_the_kid.setBounds(50,210,200,50);
        Billy_the_kid.setFont(new Font("Verdana",3,17));
        Billy_the_kid.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Billy the kid");
        PitsaInfo Billy_the_Kid = new PitsaInfo();
            Billy_the_Kid.pitsaNavn = "Billy the Kid";
            Billy_the_Kid.doygg = "Medium";
            Billy_the_Kid.pitsasós = "Pitsasós";
            Billy_the_Kid.toppings = new String[] {" Kjøt"," Leyk","Ost"};
            Main.bestidling.add(Billy_the_Kid);
            Main.dataList.addElement("Billy the kid");
        }});
        add(Billy_the_kid);

    //Hawaii
    JButton Hawaii = new JButton("03 Hawaii");
        Hawaii.setBounds(50,270,200,50);
        Hawaii.setFont(new Font("Verdana",3,17));
        Hawaii.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Hawaii");
        PitsaInfo Hawaii = new PitsaInfo();
            Hawaii.pitsaNavn = "Hawaii";
            Hawaii.doygg = "Medium";
            Hawaii.pitsasós = "Pitsasós";
            Hawaii.toppings = new String[] {"Annanas"," Skinka"," Ost"};
            Main.bestidling.add(Hawaii);
            Main.dataList.addElement("Hawaii");
        }});
        add(Hawaii);

    //Pepperoni
    JButton Pepperoni = new JButton("04 Pepperoni");
    Pepperoni.setBounds(50,330,200,50);
    Pepperoni.setFont(new Font("Verdana",3,17));
    Pepperoni.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Pepperoni");
            PitsaInfo Pepperoni = new PitsaInfo();
            Pepperoni.pitsaNavn = "Pepperoni";
            Pepperoni.doygg = "Medium";
            Pepperoni.pitsasós = "Pitsasós";
            Pepperoni.toppings = new String[] {"Pepperoni" ," Piparfrukt"};
            Main.bestidling.add(Pepperoni);
            Main.dataList.addElement("Pepperoni");
        }});
        add(Pepperoni);

    //Diablo Tyson
    JButton Diablo_Tyson = new JButton("05 Diablo Tyson");
        Diablo_Tyson.setBounds(50,390,200,50);
        Diablo_Tyson.setFont(new Font("Verdana",3,17));
        Diablo_Tyson.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Diablo Tyson");
            PitsaInfo Diablo_Tyson = new PitsaInfo();
            Diablo_Tyson.pitsaNavn = "Diablo Tyson";
            Diablo_Tyson.doygg = "Medium";
            Diablo_Tyson.pitsasós = "Pitsasós";
            Diablo_Tyson.toppings =new String[] {"Kjøt"," Pepperoni"," Chilli"," Tabasco"," Ost"};
            Main.bestidling.add(Diablo_Tyson);
            Main.dataList.addElement("Diablo Tyson");
        }});
        add(Diablo_Tyson);

    //Manchester United
    JButton Man_United = new JButton("06 Manchester");
        Man_United.setBounds(50,450,200,50);
        Man_United.setFont(new Font("Verdana",3,17));
        Man_United.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Manchester United");
            PitsaInfo Man_United = new PitsaInfo();
            Man_United.pitsaNavn = "Manchester United";
            Man_United.doygg = "Medium";
            Man_United.pitsasós = "Pitsasós";
            Man_United.toppings = new String[] {" Piparfrukt"," Annanas"," Ost"," Bacon"};
            Main.bestidling.add(Man_United);
            Main.dataList.addElement("Manchester United");
        }});
        add(Man_United);

    //Liverpool
    JButton Liverpool = new JButton("07 Liverpool");
        Liverpool.setBounds(50,510,200,50);
        Liverpool.setFont(new Font("Verdana",3,17));
        Liverpool.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Liverpool");
            PitsaInfo Liverpool = new PitsaInfo();
            Liverpool.pitsaNavn = "Liverpool";
            Liverpool.doygg = "Medium";
            Liverpool.pitsasós = "Pitsasós";
            Liverpool.toppings = new String[] {" Main"," Piparfrukt"," Chilli"," Ost"};
            Main.bestidling.add(Liverpool);
            Main.dataList.addElement("Liverpool");
        }});
        add(Liverpool);

    //Arsenal
    JButton Arsenal = new JButton("08 Arsenal");
        Arsenal.setBounds(50,570,200,50);
        Arsenal.setFont(new Font("Verdana",3,17));
        Arsenal.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Arsenal");
            PitsaInfo Arsenal = new PitsaInfo();
            Arsenal.pitsaNavn = "Arsenal";
            Arsenal.doygg = "Medium";
            Arsenal.pitsasós = "Pitsasós";
            Arsenal.toppings = new String[] {" Rækjur"," Leyk"," Hvítleyk"," Ost"};
            Main.bestidling.add(Arsenal);
            Main.dataList.addElement("Arsenal");
        }});
        add(Arsenal);

    //Todi
    JButton Todi = new JButton("09 Todi");
        Todi.setBounds(50,630,200,50);
        Todi.setFont(new Font("Verdana",3,17));
        Todi.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Todi");
            PitsaInfo Todi = new PitsaInfo();
            Todi.pitsaNavn = "Todi";
            Todi.doygg = "Medium";
            Todi.pitsasós = "Pitsasós";
            Todi.toppings = new String[]{"Pepperoni"," Leyk"," Piparfrukt" ," Tabasco"," Chilli"," Ost"," Bacon"};
            Main.bestidling.add(Todi);
            Main.dataList.addElement("Todi");
        }});
        add(Todi);

    //Homer
    JButton Homer = new JButton("10 Homer");
        Homer.setBounds(50,690,200,50);
        Homer.setFont(new Font("Verdana",3,17));
        Homer.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Homer");
            PitsaInfo Homer = new PitsaInfo();
            Homer.pitsaNavn = "Homer";
            Homer.doygg = "Medium";
            Homer.pitsasós = "Pitsasós";
            Homer.toppings = new String[]{" Skinka"," Pepperoni"," Ost"};
            Main.bestidling.add(Homer);
            Main.dataList.addElement("Homer");
        }});
        add(Homer);

    //Picasso
    JButton Picasso = new JButton("11 Picasso");
        Picasso.setBounds(50,750,200,50);
        Picasso.setFont(new Font("Verdana",3,17));
        Picasso.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Picasso");
            PitsaInfo Picasso = new PitsaInfo();
            Picasso.pitsaNavn = "Picasso";
            Picasso.doygg = "Medium";
            Picasso.pitsasós = "Pitsasós";
            Picasso.toppings = new String[]{"Kjøt"," Leyk"," Mais"," Ost"," Bacon"};
            Main.bestidling.add(Picasso);
            Main.dataList.addElement("Picasso");
        }});
        add(Picasso);

    //Miss Piggy
    JButton Miss_piggy = new JButton("12 Miss Piggy");
        Miss_piggy.setBounds(50,810,200,50);
        Miss_piggy.setFont(new Font("Verdana",3,17));
        Miss_piggy.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Miss Piggy");
            PitsaInfo Miss_piggy = new PitsaInfo();
            Miss_piggy.pitsaNavn = "Miss piggy";
            Miss_piggy.doygg = "Medium";
            Miss_piggy.pitsasós = "Pitsasós";
            Miss_piggy.toppings = new String[]{" Leyk"," Piparfrukt"," Ost"," Bacon"};
            Main.bestidling.add(Miss_piggy);
            Main.dataList.addElement("Miss Piggy");
        }});
        add(Miss_piggy);

    //Pitsa 530
    JButton Pitsa_530 = new JButton("13 Pitsa 530");
        Pitsa_530.setBounds(300,150,200,50);
        Pitsa_530.setFont(new Font("Verdana",3,17));
        Pitsa_530.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Pitsa 530");
            PitsaInfo Pitsa_530 = new PitsaInfo();
            Pitsa_530.pitsaNavn = "Pitsa 530";
            Pitsa_530.doygg = "Medium";
            Pitsa_530.pitsasós = "Pitsasós";
            Pitsa_530.toppings = new String[]{ "Skinka"," Kjøt"," Rækjur"," Ost" ," Bacon"};
            Main.bestidling.add(Pitsa_530);
            Main.dataList.addElement("Pitsa 530");
        }});
        add(Pitsa_530);

    //salat Pitsa
    JButton Salat_pitsa = new JButton("14 Salat Pitsa");
        Salat_pitsa.setBounds(300,210,200,50);
        Salat_pitsa.setFont(new Font("Verdana",3,17));
        Salat_pitsa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Salat Pitsa");
            PitsaInfo Salat_pitsa = new PitsaInfo();
            Salat_pitsa.pitsaNavn = "Salat pitsa";
            Salat_pitsa.doygg = "Medium";
            Salat_pitsa.pitsasós = "Pitsasós";
            Salat_pitsa.toppings = new String[]{"Ost"};
            Main.bestidling.add(Salat_pitsa);
            Main.dataList.addElement("salat Pitsa");
        }});
        add(Salat_pitsa);

    //Peproni Special
    JButton Peproni_special = new JButton("15 Pep Special");
        Peproni_special.setBounds(300,270,200,50);
        Peproni_special.setFont(new Font("Verdana",3,17));
        Peproni_special.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Pep Special");
            PitsaInfo Peproni_special = new PitsaInfo();
            Peproni_special.pitsaNavn = "Peproni special";
            Peproni_special.doygg = "Medium";
            Peproni_special.pitsasós = "Pitsasós";
            Peproni_special.toppings =new String[]{ "Pepperoni", " Pepperoni", " Ost", " Ost"};
            Main.bestidling.add(Peproni_special);
            Main.dataList.addElement("Peproni Special");
        }});
        add(Peproni_special);

    //Kirjastein
    JButton Kirjastein = new JButton("16 Kirjastein");
        Kirjastein.setBounds(300,330,200,50);
        Kirjastein.setFont(new Font("Verdana",3,17));
        Kirjastein.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Kirjastein");
            PitsaInfo Kirjastein = new PitsaInfo();
            Kirjastein.pitsaNavn = "Kirjastein";
            Kirjastein.doygg = "Medium";
            Kirjastein.pitsasós = "Pitsasós";
            Kirjastein.toppings = new String[]{" Annanas", " Mais", " Tun", " Ost", " Bacon"};
            Main.bestidling.add(Kirjastein);
            Main.dataList.addElement("Kirjastein");
        }});
        add(Kirjastein);

    //Bakerstreet
    JButton Bakerstreet = new JButton("17 Bakerstreet");
        Bakerstreet.setBounds(300,390,200,50);
        Bakerstreet.setFont(new Font("Verdana",3,17));
        Bakerstreet.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Bakerstreet");
            PitsaInfo Bakerstreet = new PitsaInfo();
            Bakerstreet.pitsaNavn = "Bakerstreet";
            Bakerstreet.doygg = "Medium";
            Bakerstreet.pitsasós = "Pitsasós";
            Bakerstreet.toppings = new String[]{" Annanas"," Mais", " Skinka"," Piparfrukt", " Leyk"," Soppar",
                    " Pepperoni", " Chilli", " Hvítleyk", " Tabasco", " Ost", " Bacon"};
            Main.bestidling.add(Bakerstreet);
            Main.dataList.addElement("Bakerstreet");
        }});
        add(Bakerstreet);

    //Tín Pitsa
    JButton Tin_pitsa = new JButton("18 Tin Pitsa");
        Tin_pitsa.setBounds(300,450,200,50);
        Tin_pitsa.setFont(new Font("Verdana",3,17));
        Tin_pitsa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Tin Pitsa");
            PitsaInfo Tin_pitsa = new PitsaInfo();
            Tin_pitsa.pitsaNavn = "Tin_pitsa";
            Tin_pitsa.doygg = "Medium";
            Tin_pitsa.pitsasós = "Pitsasós";
            Tin_pitsa.toppings = new String[]{"Ost"};
            Main.bestidling.add(Tin_pitsa);
            Main.dataList.addElement("Tín Pitsa");
        }});
        add(Tin_pitsa);

    //Vegitar Pitsa
    JButton Vegitar_pitsa = new JButton("19 Vegitar Pitsa");
        Vegitar_pitsa.setBounds(300,510,200,50);
        Vegitar_pitsa.setFont(new Font("Verdana",3,17));
        Vegitar_pitsa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Vegitar Pitsa");
            PitsaInfo Vegitar_pitsa = new PitsaInfo();
            Vegitar_pitsa.pitsaNavn = "Vegitar_pitsa";
            Vegitar_pitsa.doygg = "Medium";
            Vegitar_pitsa.pitsasós = "Pitsasós";
            Vegitar_pitsa.toppings = new String[]{"Soppar" + " Piparfrukt", " Leyk", " Mais", " Ost"};
            Main.bestidling.add(Vegitar_pitsa);
            Main.dataList.addElement("Vegitar Pitsa");
        }});
        add(Vegitar_pitsa);

    //Broytt
    JButton Broytt = new JButton("broytt");
        Broytt.setBounds(600,500,200,70);
        Broytt.setFont(new Font("Verdana",3,17));
        Broytt.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int selected = list.getSelectedIndex();
            select = selected;
            System.out.println("Broytt");
            System.out.println(selected);
            if(selected != -1 ) {
                broytt_pitsa broyttPitsa = new broytt_pitsa();
                broyttPitsa.Broytt_pitsa();
            }
        }});
        add(Broytt);

    //Grill
    JButton Grill = new JButton("Grill");
        Grill.setBounds(600,600,200,70);
        Grill.setFont(new Font("Verdana",3,17));
        Grill.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Grill");
            getMain().NavigateTo("Grill");

        }});
        add(Grill);

    //Strika
    JButton Strika = new JButton("Strika");
        Strika.setBounds(600,700,200,70);
        Strika.setFont(new Font("Verdana",3,17));
        Strika.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Strika");
            int selected = list.getSelectedIndex();
        if (selected != -1 ){
            Main.dataList.remove(selected);
            Main.bestidling.remove(selected);
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
            Main.dataList.removeAllElements();
            Main.bestidling.clear();
        }});
        add(Ligut);
}
}
