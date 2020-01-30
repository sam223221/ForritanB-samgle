package fo.samgle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("er navn Palindrom").toLowerCase(), revers = "";

        int lenght = name.length();

        for(int i = lenght - 1 ; i >= 0 ; i--){

            revers = revers + name.charAt(i);

        }
        if(name.equals(revers)){
            System.out.println("hettar er ein pallinom");
        }else{
            System.out.println("nigga you gay??");

        }
    }
}
