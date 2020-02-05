package fo.samgle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String date = JOptionPane.showInputDialog("Àrstal");
        int a = Integer.parseInt(date);

        if((a % 4 == 0 && a % 100 != 0 )|| a  %  400 ==0 ){
         System.out.println("tað er skotár");
        }else{
            System.out.println("tað er ikki skotár");
        }




    }
}
