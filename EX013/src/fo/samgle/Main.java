package fo.samgle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String heystak = JOptionPane.showInputDialog("er tað ein lija");
        String needel = JOptionPane.showInputDialog("er tað i?");

        int lenghthey = heystak.length();
        int lenghtneed = needel.length();

        System.out.println(lenghtneed);

        for(int i = lenghtneed; i <= lenghthey ;i++){

            int tjek = i - lenghtneed;

            for(int a = tjek; a < lenghtneed ; a++){



            }
/*/
            String test = heystak.charAt(lenghtneed);

            if(heystak.charAt(lenghtneed)){
/*/
            }
        }

    }
