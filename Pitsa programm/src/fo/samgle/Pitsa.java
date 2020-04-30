package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pitsa extends Matur {

public void pitsa(){
    JFrame f = new JFrame();
    Bestidling order = new Bestidling();

    //listin
    JList list = new JList(dataList);
    list.setBounds(600 , 150 , 200 , 300);
    Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
    list.setBorder(border);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


    //Margarita
    JButton Margarita = new JButton("01 Margarita");
        Margarita.setBounds(50,150,200,50);
        Margarita.setFont(new Font("Verdana",3,17));
        Margarita.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Margarita");
        Matur margarita = new Matur();
        margarita.pitsaNavn = "Margarita";
        margarita.doygg = "Medium";
        margarita.pitsasós = "Pitsasós";
        margarita.toppings = new String[]{"Ost"};
        order.bestidling.add(margarita);
        dataList.addElement("Margarita");
        }});
        f.add(Margarita);

    //Billy the kid
    JButton Billy_the_kid  = new JButton("02 Billy the kid");
        Billy_the_kid.setBounds(50,210,200,50);
        Billy_the_kid.setFont(new Font("Verdana",3,17));
        Billy_the_kid.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Billy the kid");
        Matur Billy_the_Kid = new Matur();
            Billy_the_Kid.pitsaNavn = "Billy the Kid";
            Billy_the_Kid.doygg = "Medium";
            Billy_the_Kid.pitsasós = "Pitsasós";
            Billy_the_Kid.toppings = new String[] {" Kjøt"," Leyk","Ost"};
            order.bestidling.add(Billy_the_Kid);
            dataList.addElement("Billy the kid");
        }});
        f.add(Billy_the_kid);

    //Hawaii
    JButton Hawaii = new JButton("03 Hawaii");
        Hawaii.setBounds(50,270,200,50);
        Hawaii.setFont(new Font("Verdana",3,17));
        Hawaii.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Hawaii");
        Matur Hawaii = new Matur();
            Hawaii.pitsaNavn = "Hawaii";
            Hawaii.doygg = "Medium";
            Hawaii.pitsasós = "Pitsasós";
            Hawaii.toppings = new String[] {"Annanas"," Skinka"," Ost"};
            order.bestidling.add(Hawaii);
            dataList.addElement("Hawaii");
        }});
        f.add(Hawaii);

    //Pepperoni
    JButton Pepperoni = new JButton("04 Pepperoni");
    Pepperoni.setBounds(50,330,200,50);
    Pepperoni.setFont(new Font("Verdana",3,17));
    Pepperoni.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Pepperoni");
            Matur Pepperoni = new Matur();
            Pepperoni.pitsaNavn = "Pepperoni";
            Pepperoni.doygg = "Medium";
            Pepperoni.pitsasós = "Pitsasós";
            Pepperoni.toppings = new String[] {"Pepperoni" ," Piparfrukt"};
            order.bestidling.add(Pepperoni);
            dataList.addElement("Pepperoni");
        }});
        f.add(Pepperoni);

    //Diablo Tyson
    JButton Diablo_Tyson = new JButton("05 Diablo Tyson");
        Diablo_Tyson.setBounds(50,390,200,50);
        Diablo_Tyson.setFont(new Font("Verdana",3,17));
        Diablo_Tyson.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Diablo Tyson");
            Matur Diablo_Tyson = new Matur();
            Diablo_Tyson.pitsaNavn = "Diablo Tyson";
            Diablo_Tyson.doygg = "Medium";
            Diablo_Tyson.pitsasós = "Pitsasós";
            Diablo_Tyson.toppings =new String[] {"Kjøt"," Pepperoni"," Chilli"," Tabasco"," Ost"};
            order.bestidling.add(Diablo_Tyson);
            dataList.addElement("Diablo Tyson");
        }});
        f.add(Diablo_Tyson);

    //Manchester United
    JButton Man_United = new JButton("06 Manchester");
        Man_United.setBounds(50,450,200,50);
        Man_United.setFont(new Font("Verdana",3,17));
        Man_United.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Manchester United");
            Matur Man_United = new Matur();
            Man_United.pitsaNavn = "Manchester United";
            Man_United.doygg = "Medium";
            Man_United.pitsasós = "Pitsasós";
            Man_United.toppings = new String[] {" Piparfrukt"," Annanas"," Ost"," Bacon"};
            order.bestidling.add(Man_United);
            dataList.addElement("Manchester United");
        }});
        f.add(Man_United);

    //Liverpool
    JButton Liverpool = new JButton("07 Liverpool");
        Liverpool.setBounds(50,510,200,50);
        Liverpool.setFont(new Font("Verdana",3,17));
        Liverpool.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Liverpool");
            Matur Liverpool = new Matur();
            Liverpool.pitsaNavn = "Liverpool";
            Liverpool.doygg = "Medium";
            Liverpool.pitsasós = "Pitsasós";
            Liverpool.toppings = new String[] {" Main"," Piparfrukt"," Chilli"," Ost"};
            order.bestidling.add(Liverpool);
            dataList.addElement("Liverpool");
        }});
        f.add(Liverpool);

    //Arsenal
    JButton Arsenal = new JButton("08 Arsenal");
        Arsenal.setBounds(50,570,200,50);
        Arsenal.setFont(new Font("Verdana",3,17));
        Arsenal.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Arsenal");
            Matur Arsenal = new Matur();
            Arsenal.pitsaNavn = "Arsenal";
            Arsenal.doygg = "Medium";
            Arsenal.pitsasós = "Pitsasós";
            Arsenal.toppings = new String[] {" Rækjur"," Leyk"," Hvítleyk"," Ost"};
            order.bestidling.add(Arsenal);
            dataList.addElement("Arsenal");
        }});
        f.add(Arsenal);

    //Todi
    JButton Todi = new JButton("09 Todi");
        Todi.setBounds(50,630,200,50);
        Todi.setFont(new Font("Verdana",3,17));
        Todi.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Todi");
            Matur Todi = new Matur();
            Todi.pitsaNavn = "Todi";
            Todi.doygg = "Medium";
            Todi.pitsasós = "Pitsasós";
            Todi.toppings = new String[]{"Pepperoni"," Leyk"," Piparfrukt" ," Tabasco"," Chilli"," Ost"," Bacon"};
            order.bestidling.add(Todi);
            dataList.addElement("Todi");
        }});
        f.add(Todi);

    //Homer
    JButton Homer = new JButton("10 Homer");
        Homer.setBounds(50,690,200,50);
        Homer.setFont(new Font("Verdana",3,17));
        Homer.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Homer");
            Matur Homer = new Matur();
            Homer.pitsaNavn = "Homer";
            Homer.doygg = "Medium";
            Homer.pitsasós = "Pitsasós";
            Homer.toppings = new String[]{" Skinka"," Pepperoni"," Ost"};
            order.bestidling.add(Homer);
            dataList.addElement("Homer");
        }});
        f.add(Homer);

    //Picasso
    JButton Picasso = new JButton("11 Picasso");
        Picasso.setBounds(50,750,200,50);
        Picasso.setFont(new Font("Verdana",3,17));
        Picasso.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Picasso");
            Matur Picasso = new Matur();
            Picasso.pitsaNavn = "Picasso";
            Picasso.doygg = "Medium";
            Picasso.pitsasós = "Pitsasós";
            Picasso.toppings = new String[]{"Kjøt"," Leyk"," Mais"," Ost"," Bacon"};
            order.bestidling.add(Picasso);
            dataList.addElement("Picasso");
        }});
        f.add(Picasso);

    //Miss Piggy
    JButton Miss_piggy = new JButton("12 Miss Piggy");
        Miss_piggy.setBounds(50,810,200,50);
        Miss_piggy.setFont(new Font("Verdana",3,17));
        Miss_piggy.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Miss Piggy");
            Matur Miss_piggy = new Matur();
            Miss_piggy.pitsaNavn = "Miss piggy";
            Miss_piggy.doygg = "Medium";
            Miss_piggy.pitsasós = "Pitsasós";
            Miss_piggy.toppings = new String[]{" Leyk"," Piparfrukt"," Ost"," Bacon"};
            order.bestidling.add(Miss_piggy);
            dataList.addElement("Miss Piggy");
        }});
        f.add(Miss_piggy);

    //Pitsa 530
    JButton Pitsa_530 = new JButton("13 Pitsa 530");
        Pitsa_530.setBounds(300,150,200,50);
        Pitsa_530.setFont(new Font("Verdana",3,17));
        Pitsa_530.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Pitsa 530");
            Matur Pitsa_530 = new Matur();
            Pitsa_530.pitsaNavn = "Pitsa 530";
            Pitsa_530.doygg = "Medium";
            Pitsa_530.pitsasós = "Pitsasós";
            Pitsa_530.toppings = new String[]{ "Skinka"," Kjøt"," Rækjur"," Ost" ," Bacon"};
            order.bestidling.add(Pitsa_530);
            dataList.addElement("Pitsa 530");
        }});
        f.add(Pitsa_530);

    //salat Pitsa
    JButton Salat_pitsa = new JButton("14 Salat Pitsa");
        Salat_pitsa.setBounds(300,210,200,50);
        Salat_pitsa.setFont(new Font("Verdana",3,17));
        Salat_pitsa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Salat Pitsa");
            Matur Salat_pitsa = new Matur();
            Salat_pitsa.pitsaNavn = "Salat pitsa";
            Salat_pitsa.doygg = "Medium";
            Salat_pitsa.pitsasós = "Pitsasós";
            Salat_pitsa.toppings = new String[]{"Ost"};
            order.bestidling.add(Salat_pitsa);
            dataList.addElement("salat Pitsa");
        }});
        f.add(Salat_pitsa);

    //Peproni Special
    JButton Peproni_special = new JButton("15 Pep Special");
        Peproni_special.setBounds(300,270,200,50);
        Peproni_special.setFont(new Font("Verdana",3,17));
        Peproni_special.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Pep Special");
            Matur Peproni_special = new Matur();
            Peproni_special.pitsaNavn = "Peproni special";
            Peproni_special.doygg = "Medium";
            Peproni_special.pitsasós = "Pitsasós";
            Peproni_special.toppings =new String[]{ "Pepperoni", " Pepperoni", " Ost", " Ost"};
            order.bestidling.add(Peproni_special);
            dataList.addElement("Peproni Special");
        }});
        f.add(Peproni_special);

    //Kirjastein
    JButton Kirjastein = new JButton("16 Kirjastein");
        Kirjastein.setBounds(300,330,200,50);
        Kirjastein.setFont(new Font("Verdana",3,17));
        Kirjastein.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Kirjastein");
            Matur Kirjastein = new Matur();
            Kirjastein.pitsaNavn = "Kirjastein";
            Kirjastein.doygg = "Medium";
            Kirjastein.pitsasós = "Pitsasós";
            Kirjastein.toppings = new String[]{" Annanas", " Mais", " Tun", " Ost", " Bacon"};
            order.bestidling.add(Kirjastein);
            dataList.addElement("Kirjastein");
        }});
        f.add(Kirjastein);

    //Bakerstreet
    JButton Bakerstreet = new JButton("17 Bakerstreet");
        Bakerstreet.setBounds(300,390,200,50);
        Bakerstreet.setFont(new Font("Verdana",3,17));
        Bakerstreet.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Bakerstreet");
            Matur Bakerstreet = new Matur();
            Bakerstreet.pitsaNavn = "Bakerstreet";
            Bakerstreet.doygg = "Medium";
            Bakerstreet.pitsasós = "Pitsasós";
            Bakerstreet.toppings = new String[]{" Annanas"," Mais", " Skinka"," Piparfrukt", " Leyk"," Soppar",
                    " Pepperoni", " Chilli", " Hvítleyk", " Tabasco", " Ost", " Bacon"};
            order.bestidling.add(Bakerstreet);
            dataList.addElement("Bakerstreet");
        }});
        f.add(Bakerstreet);

    //Tín Pitsa
    JButton Tin_pitsa = new JButton("18 Tin Pitsa");
        Tin_pitsa.setBounds(300,450,200,50);
        Tin_pitsa.setFont(new Font("Verdana",3,17));
        Tin_pitsa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Tin Pitsa");
            Matur Tin_pitsa = new Matur();
            Tin_pitsa.pitsaNavn = "Tin_pitsa";
            Tin_pitsa.doygg = "Medium";
            Tin_pitsa.pitsasós = "Pitsasós";
            Tin_pitsa.toppings = new String[]{"Ost"};
            order.bestidling.add(Tin_pitsa);
            dataList.addElement("Tín Pitsa");
        }});
        f.add(Tin_pitsa);

    //Vegitar Pitsa
    JButton Vegitar_pitsa = new JButton("19 Vegitar Pitsa");
        Vegitar_pitsa.setBounds(300,510,200,50);
        Vegitar_pitsa.setFont(new Font("Verdana",3,17));
        Vegitar_pitsa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Vegitar Pitsa");
            Matur Vegitar_pitsa = new Matur();
            Vegitar_pitsa.pitsaNavn = "Vegitar_pitsa";
            Vegitar_pitsa.doygg = "Medium";
            Vegitar_pitsa.pitsasós = "Pitsasós";
            Vegitar_pitsa.toppings = new String[]{"Soppar" + " Piparfrukt", " Leyk", " Mais", " Ost"};
            order.bestidling.add(Vegitar_pitsa);
            dataList.addElement("Vegitar Pitsa");
        }});
        f.add(Vegitar_pitsa);

    //Broytt
    JButton Broytt = new JButton("broytt");
        Broytt.setBounds(600,500,200,70);
        Broytt.setFont(new Font("Verdana",3,17));
        Broytt.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Broytt");
            broytt_pitsa bp = new broytt_pitsa();
            bp.Broytt_pitsa();
        }});
        f.add(Broytt);

    //Grill
    JButton Grill = new JButton("Grill");
        Grill.setBounds(600,600,200,70);
        Grill.setFont(new Font("Verdana",3,17));
        Grill.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Grill");
            fo.samgle.Grill g = new Grill();
            g.Grill();
        }});
        f.add(Grill);

    //Strika
    JButton Strika = new JButton("Strika");
        Strika.setBounds(600,700,200,70);
        Strika.setFont(new Font("Verdana",3,17));
        Strika.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){ System.out.println("Strika");
        int selected = list.getSelectedIndex();
        if (selected != -1 ){
            dataList.remove(selected);
        }
        }});
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
            System.out.println(order.bestidling);
        }});
        f.add(Ligut);



    //upsetanin
    f.add(list);
    f.setSize(900,1000);
    f.setLayout(null);
    f.setVisible(true);
}
}
