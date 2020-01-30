package fo.samgle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        String a = JOptionPane.showInputDialog("gev eitt tal");

        int tal = Integer.parseInt(a);
        int out = 1;

    for (int i = 1; i <= tal  ; i++){
        out = out * i;

    }

    System.out.println(out);

    }
}
