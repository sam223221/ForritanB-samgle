package fo.samgle;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random randTal = new Random();
        int  tal = randTal.nextInt(101);

            for(int i = 0; i < 1;){

                String get = JOptionPane.showInputDialog("gev eitt tal millum eitt og hundra");
                int a = Integer.parseInt(get);


                if (a == tal){
                    i = 1;
                }

                 if (a > tal){
                System.out.println("sindur minni");
                 }
                 if (a < tal){
                System.out.println("sindur hagri");
                 }

        }
        System.out.println("tillukku tal var " + tal);
    }
}
