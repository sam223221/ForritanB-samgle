package fo.samgle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String date = JOptionPane.showInputDialog("What is your name?");
        System.out.println("dato er" + date);

        String day = date.substring(0,2);

        int month=12;
        int year=2019;
            System.out.println("skriva undir her hvat fyri dag tú vilt hava");

            System.out.println(day + "-" + month + "-" + year);

                day++;
            System.out.println(day + "-" + month + "-" + year);
/*/
    }
}