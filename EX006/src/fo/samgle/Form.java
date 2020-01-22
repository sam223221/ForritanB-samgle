package fo.samgle;

import javax.swing.*;

public class Form {



        public static void main(String[] args) {
                int Dim [] = {31,28,100,500,321,626,65,9,182,26,6321,61,126,155,66} , n;
                int i=0;
                int teljari=0;
                int plussa = 0;
                int a = 0;

                n = Dim.length;

                for (int b = 0; b < n ; b++)
                        if (i < n) {
                                a = a + Dim[teljari];
                                plussa = plussa + a;
                                teljari++;
                        }
                System.out.println("hettar er alt samantalt " + plussa);



        }


}
