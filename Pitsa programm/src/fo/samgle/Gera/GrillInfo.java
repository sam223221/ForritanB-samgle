package fo.samgle.Gera;

import fo.samgle.Gera.MatInfo;

public class GrillInfo extends MatInfo {

    String GrillNavn = "";


    @Override
    public String toString() {

        return  "\n\r" +
                "GrillNavn      : " + GrillNavn + "\n\r"+
                "Eyka tilhoyri  : " + Filla      + "\n\r";
    }

}
