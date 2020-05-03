package fo.samgle;

public class GrillInfo {

    String BurgaraNavn = "";
    String Búffar = "";
    String[] Filla;

    @Override
    public String toString() {

        return  "\n\r" +
                "   Burgara Navn    : " + BurgaraNavn + "\n\r" +
                "   Búffar          : " + Búffar      + "\n\r" +
                "   fillan          : " + Filla       + "\n\r" ;
    }

}
