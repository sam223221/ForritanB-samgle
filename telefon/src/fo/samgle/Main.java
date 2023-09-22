package fo.samgle;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        telefon T1 = new telefon();
        T1.EigaraNavn = "Sjúrður";
        T1.Freamleiðari = "Kina";
        T1.Model = "Apple";
        T1.SkermStødd = 20;

        telefon T2 = new telefon();
        T2.EigaraNavn = "Hans";
        T2.Freamleiðari = "Japan";
        T2.Model = "Samsung";
        T2.SkermStødd = 10;

        telefon T3 = new telefon();
        T3.EigaraNavn = "Magni";
        T3.Freamleiðari = "Intel";
        T3.Model = "RED";
        T3.SkermStødd = 30;

        ArrayList<telefon> Telefonhaldari = new ArrayList();
        Telefonhaldari.add(T1);
        Telefonhaldari.add(T2);
        Telefonhaldari.add(T3);

        String Input = JOptionPane.showInputDialog("hvat er navn títt");

        for(int i = 0; i < Telefonhaldari.size(); i++){
            telefon t = Telefonhaldari.get(i);

            if (t.EigaraNavn.equals(Input)){

                System.out.println(
                    "       Eiðari:"        + t.EigaraNavn + 
                    "       framleiðari:"   + t.Freamleiðari + 
                    "       Model:"         + t.Model + 
                    "       skermstødd:"    + t.SkermStødd);
                return;
            }

        }
    }
}
