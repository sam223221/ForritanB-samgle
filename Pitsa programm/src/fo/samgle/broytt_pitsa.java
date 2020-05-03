package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class broytt_pitsa {

    public void Broytt_pitsa(){

        //uppseting
        JFrame f = new JFrame();
        f.setSize(900,500);
        f.setLayout(null);
        f.setVisible(true);
        String topping;

        //listi
        DefaultListModel BroyttDataList = new DefaultListModel();
        JList list = new JList(BroyttDataList);
        list.setBounds(660 , 20 , 200 , 200);
        Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
        list.setBorder(border);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        f.add(list);

        int tel ;
        for ( int i = 0 ; i < tel; i++) {
          // BroyttDataList.addElement(Main.bestidling.get().toppings[i]);
        }


        //Ostur
        JButton Ostur = new JButton("Ostur");
        Ostur.setBounds(25,20,175,50);
        Ostur.setFont(new Font("Verdana",3,17));
        Ostur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari");
            }});
        f.add(Ostur);



        //Pepperoni
        JButton Pepperoni = new JButton("Pepparoni");
        Pepperoni.setBounds(25,90,175,50);
        Pepperoni.setFont(new Font("Verdana",3,17));
        Pepperoni.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Pepperoni);


        //Bacon
        JButton Bacon = new JButton("Bacon");
        Bacon.setBounds(25,160,175,50);
        Bacon.setFont(new Font("Verdana",3,17));
        Bacon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Bacon);


        //Skinka
        JButton Skinka = new JButton("Skinka");
        Skinka.setBounds(25,230,175,50);
        Skinka.setFont(new Font("Verdana",3,17));
        Skinka.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Skinka);


        //Kjøt
        JButton Kjøt = new JButton("Kjøt");
        Kjøt.setBounds(25,300,175,50);
        Kjøt.setFont(new Font("Verdana",3,17));
        Kjøt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Kjøt);


        //Tun
        JButton Tun = new JButton("Tun");
        Tun.setBounds(25,370,175,50);
        Tun.setFont(new Font("Verdana",3,17));
        Tun.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Tun);

        //Rækjur
        JButton Rækjur = new JButton("Rækjur");
        Rækjur.setBounds(225,20,175,50);
        Rækjur.setFont(new Font("Verdana",3,17));
        Rækjur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Rækjur);



        //Leyk
        JButton Leyk = new JButton("Leyk");
        Leyk.setBounds(225,90,175,50);
        Leyk.setFont(new Font("Verdana",3,17));
        Leyk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Leyk);


        //Annanas
        JButton Annanas = new JButton("Annanas");
        Annanas.setBounds(225,160,175,50);
        Annanas.setFont(new Font("Verdana",3,17));
        Annanas.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Annanas);


        //Piparfrukt
        JButton Piparfrukt = new JButton("Piparfrukt");
        Piparfrukt.setBounds(225,230,175,50);
        Piparfrukt.setFont(new Font("Verdana",3,17));
        Piparfrukt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Piparfrukt);


        //Soppar
        JButton Soppar = new JButton("Soppar");
        Soppar.setBounds(225,300,175,50);
        Soppar.setFont(new Font("Verdana",3,17));
        Soppar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Soppar);


        //Mais
        JButton Mais = new JButton("Mais");
        Mais.setBounds(225,370,175,50);
        Mais.setFont(new Font("Verdana",3,17));
        Mais.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Mais);

        //Hvítleyk
        JButton Hvítleyk = new JButton("Hvítleyk");
        Hvítleyk.setBounds(450,20,175,50);
        Hvítleyk.setFont(new Font("Verdana",3,17));
        Hvítleyk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Hvítleyk);



        //Tabasco
        JButton Tabasco = new JButton("Tbasco");
        Tabasco.setBounds(450,90,175,50);
        Tabasco.setFont(new Font("Verdana",3,17));
        Tabasco.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Tabasco);


        //Jalapeno
        JButton Jalapeno = new JButton("Jalabeno");
        Jalapeno.setBounds(450,160,175,50);
        Jalapeno.setFont(new Font("Verdana",3,17));
        Jalapeno.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Jalapeno);


        //1000 Islands
        JButton Islands = new JButton("1000 Islands");
        Islands.setBounds(450,230,175,50);
        Islands.setFont(new Font("Verdana",3,17));
        Islands.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Islands);


        //Cream fresh
        JButton Cream = new JButton("creme fraiche");
        Cream.setBounds(450,300,175,50);
        Cream.setFont(new Font("Verdana",3,17));
        Cream.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(Cream);


        //BBQ
        JButton BBQ = new JButton("BBQ");
        BBQ.setBounds(450,370,175,50);
        BBQ.setFont(new Font("Verdana",3,17));
        BBQ.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ System.out.println("Jumbo Burgari"); }});
        f.add(BBQ);


        //Ligut
        JButton Ligut = new JButton("Ligut");
        Ligut.setBounds(685,370,175,50);
        Ligut.setFont(new Font("Verdana",3,17));
        Ligut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Ligut");
                for(int i = 0 ; i < BroyttDataList.size() ; i++){
                    Main.bestidling.get(Pitsa.selected).toppings.toString().replace(i,BroyttDataList.get(i));
                }
            }});
        f.add(Ligut);


        //av
        JButton Strika = new JButton("av");
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
