package fo.samgle;

public class GrillInfo extends PitsaInfo{

    String GrillNavn = "";
    String[] Eyka;
    @Override
    public String toString() {

        return  "\n\r" +
                "GrillNavn      : " + GrillNavn + "\n\r"+
                "Eyka tilhoyri  : " + Eyka      + "\n\r";
    }

}
