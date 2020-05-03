package fo.samgle;

import java.util.ArrayList;

public class PitsaInfo {


    String pitsaNavn = "";
    String doygg = "";
    String pitsasós = "";
    String[] toppings;

    @Override
    public String toString() {

        return  "\n\r" +
                "   Pitsa Navn : " + pitsaNavn+ "\n\r" +
                "   Doygg      : " + doygg    + "\n\r" +
                "   pitsaos    : " + pitsasós + "\n\r" +
                "   toppings   :"  + toppings + "\n\r" ;

    }

}