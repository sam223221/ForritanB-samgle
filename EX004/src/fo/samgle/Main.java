package fo.samgle;

public class Main {

    public static void main(String[] args) {

        String date = System.console().readLine();;

        int day = Integer.parseInt(date);
        int month=12;
        int year=2019;
            System.out.println("skriva undir her hvat fyri dag tú vilt hava");

            System.out.println(day + "-" + month + "-" + year);

                day++;
            System.out.println(day + "-" + month + "-" + year);


    }
}
