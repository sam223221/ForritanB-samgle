package fo.samgle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String date = JOptionPane.showInputDialog("Àrstal");
        int ar = Integer.parseInt(date);

        if((ar % 4 == 0 && ar % 100 != 0 )|| ar  %  400 ==0 ){
         System.out.println("tað er skotár");
        }else{
            System.out.println("tað er ikki skotár");
        }




    }
}
