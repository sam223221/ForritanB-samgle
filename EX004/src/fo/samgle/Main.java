package fo.samgle;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String date = JOptionPane.showInputDialog("inset dag?");
        String month = JOptionPane.showInputDialog("inset Mána");
        String year = JOptionPane.showInputDialog("inset ár");

        int d = Integer.parseInt(date) + 1;
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);



        int Dim [] = {31,28,31,30,31,30,31,31,30,31,30,31};

        if((y % 4 == 0 && y % 100 != 0 )|| y  %  400 ==0 ){
            Dim[1]=29;
        }

        if (d > Dim[m-1]) {
            d = 1;
            m++;
          }

        if (m > 12){
            m = 1;
            y++;

        }

        System.out.println("dato er" + d +"-" + m + "-"+ y );


    }
}