package fo.samgle.Gera;

import fo.samgle.Gera.MatInfo;

public class PitsaInfo extends MatInfo {
    String pitsaNavn    = "";
    String doygg        = "";
    String pitsasós     = "";

    @Override
    public String toString() {

        return
                "Pitsa Navn : " + pitsaNavn   + "\n\r" +
                "   Doygg      : " + doygg       + "\n\r" +
                "   pitsasós   : " + pitsasós    + "\n\r" +
                "   toppings   : "  + Filla      + "\n\r" +
                "___________________________________________\n\r" + "\n\r";

    }

}