package fo.samgle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String date = JOptionPane.showInputDialog("gev eitt dato");
        String a = "Desembur";

        if (a.equals(date)) {
            System.out.println("tað er jól");
        } else {
            System.out.println("hevði tað bara veri jól");
        }
    }
} 
