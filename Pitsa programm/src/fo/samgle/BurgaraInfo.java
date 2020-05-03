package fo.samgle;

public class BurgaraInfo extends PitsaInfo{

    String BurgaraNavn = "";
    int Búffar;
    String[] Filla;

    @Override
    public String toString() {

        return  "\n\r" +
                "   Burgara Navn    : " + BurgaraNavn + "\n\r" +
                "   Búffar          : " + Búffar      + "\n\r" +
                "   fillan          : " + Filla       + "\n\r" ;
    }

}
