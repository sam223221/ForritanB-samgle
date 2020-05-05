package fo.samgle.Gera;

public class BurgaraInfo extends MatInfo {

    String BurgaraNavn = "";
    int Búffar;

    @Override
    public String toString() {

        return
                " Burgara Navn    : " + BurgaraNavn + "\n\r" +
                "   Búffar          : " + Búffar      + "\n\r" +
                "   fillan          : " + Filla       + "\n\r" +
                "___________________________________________\n\r" + "\n\r" ;
    }

}
