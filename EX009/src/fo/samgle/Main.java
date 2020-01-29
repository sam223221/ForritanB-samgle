package fo.samgle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        String Pengar = JOptionPane.showInputDialog("hvussu nógvar pengar hevur tú");
        String ar = JOptionPane.showInputDialog("hvussu nógv ár?");


        int money   =   Integer.parseInt(Pengar);
        int year    =   Integer.parseInt(ar);
        double save =   money;
        double rent =   1.02;

        for(int i = 1; i <= year; i++){

         save = save * rent;

            System.out.println(save + " hevur tú í ár " + i);
        }


    }
}
