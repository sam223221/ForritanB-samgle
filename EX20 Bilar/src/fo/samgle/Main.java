package fo.samgle;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bilur b0 = new Bilur();     //Bilur nummar eitt

        b0.Framleiðari = "Maszda";
        b0.Model       = "6 2006";
        b0.Motorstødd  = "2,4 Benzin";
        b0.EigaraNavn  = "Sam Gleðisheygg";
        b0.Ferð        = 0 ;
        b0.Nummarpláta = "NK607";

        Bilur b1 = new Bilur();     //Bilur nummar tvey

        b1.Framleiðari = "Citroën";
        b1.Model       = "C4";
        b1.Motorstødd  = "2,0 Disel";
        b1.EigaraNavn  = "Hjalti Gleðisheygg";
        b1.Ferð        = 0 ;
        b1.Nummarpláta = "FN700";

        Bilur b2 = new Bilur();     //Bilur nummar trý

        b2.Framleiðari = "TOYOTA";
        b2.Model       = "Yaris";
        b2.Motorstødd  = "1,2 Benzin";
        b2.EigaraNavn  = "dávið Hentze";
        b2.Ferð        = 0 ;
        b2.Nummarpláta = "AF453";



        ArrayList<Bilur> bil = new ArrayList();
        bil.add(b0);
        bil.add(b1);
        bil.add(b2);



        String Input = JOptionPane.showInputDialog("Hvat er nummarplátan hjá tær");

        for(int i = 0; i < bil.size(); i++){
            Bilur t = bil.get(i);

            if (t.Nummarpláta.equals(Input)){

                System.out.println("Bilslag " + t.toString());
                t.Koyr();
                System.out.println("Ferðin " + t.Ferð);
                t.Bremsa();
                System.out.println("Ferðin " + t.Ferð);

                break;
            }

        }
    }

}
