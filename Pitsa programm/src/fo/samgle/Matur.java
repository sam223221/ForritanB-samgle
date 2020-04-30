package fo.samgle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

public class Matur {
    DefaultListModel dataList = new DefaultListModel();

    String pitsaNavn = "";
    String doygg = "";
    String pitsasós = "";
    String[] toppings ;

    String BurgarNavn   = "";
    String Dressing     = "";
    String Millum       = "";

    @Override
    public String toString() {

        return "\n\r" +
                "   Pitsa Navn : " + pitsaNavn+ "\n\r" +
                "   Doygg      : " + doygg    + "\n\r" +
                "   pitsaos    : " + pitsasós + "\n\r" +
                "   toppings   :"  + toppings + "\n\r" ;

    }

}