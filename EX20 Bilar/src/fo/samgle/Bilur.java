package fo.samgle;

public class Bilur {

    public String   Framleiðari     =   "";
    public String   Model           =   "";
    public String   Motorstødd      =   "";
    public String   EigaraNavn      =   "";
    public String   Nummarpláta     =   "";
    public Integer  Ferð            =   0 ;

    @Override
    public String toString(){

        return  "\n\r" +
                "   Nummar Pláta  "        + Nummarpláta + "\n\r" +
                "   Framleiðari   "        + Framleiðari + "\n\r" +
                "   Model         "        + Model       + "\n\r" +
                "   MotorStødd    "        + Motorstødd  + "\n\r" +
                "   EigaraNavn    "        + EigaraNavn  + "\n\r"
                ;
    }

        public void Koyr() {
            this.Ferð = 50;
        }

        public void Bremsa(){
            this.Ferð = 0;
        }

}
