package fo.samgle;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bilur NK607 = new Bilur();     //Bilur nummar eitt

        NK607.Framleiðari = "Maszda";
        NK607.Model       = "6 2006";
        NK607.Motorstødd  = "2,4 Benzin";
        NK607.EigaraNavn  = "Sam Gleðisheygg";
        NK607.Ferð        = 0 ;
        NK607.Nummarpláta = "NK607";

        Bilur FN700 = new Bilur();     //Bilur nummar tvey

        FN700.Framleiðari = "Citroën";
        FN700.Model       = "C4";
        FN700.Motorstødd  = "2,0 Disel";
        FN700.EigaraNavn  = "Hjalti Gleðisheygg";
        FN700.Ferð        = 0 ;
        FN700.Nummarpláta = "FN700";

        Bilur AF453 = new Bilur();     //Bilur nummar trý

        AF453.Framleiðari = "TOYOTA";
        AF453.Model       = "Yaris";
        AF453.Motorstødd  = "1,2 Benzin";
        AF453.EigaraNavn  = "dávið Hentze";
        AF453.Ferð        = 0 ;
        AF453.Nummarpláta = "AF453";


        ArrayList<Bilur> NummarPláta = new ArrayList();
        NummarPláta.add(NK607);
        NummarPláta.add(FN700);
        NummarPláta.add(AF453);

        String Input = JOptionPane.showInputDialog("Hvat er nummarplátan hjá tær");

        for(int i = 0; i < NummarPláta.size(); i++){
            Bilur t = NummarPláta.get(i);

            if (t.Nummarpláta.equals(Input)){

                System.out.println("Bilslag " + t.toString());
                t.Koyr();
                System.out.println("Ferðin " + t.Ferð);
                t.Bremsa();
                System.out.println("Ferðin " + t.Ferð);

                return;
            }

        }
    }

}
