package fo.samgle;

public class Form {
    static String months[];

    public static void main(String[] args) {

        months = new String[13];
        months[0] = null ;
        months[1] = "January";
        months[2] = "February";
        months[3] = "March";
        months[4] = "April";
        months[5] = "May";
        months[6] = "June";
        months[7] = "July";
        months[8] = "August";
        months[9] = "September";
        months[10] = "October";
        months[11] = "November";
        months[12] = "December";
        int m = Integer.parseInt( args[0] );
        System.out.println( months[ m ] );
    }

}
