package fo.samgle;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String svar = JOptionPane.showInputDialog("ger eina kodu sum skal gitast");

        boolean corect = false;

        char[] word = new char[svar.length()];
        char[] solutionMasked = new char[svar.length()];
        ArrayList<Character> reveald = new ArrayList();

        for (int i = 0; i < svar.length(); i++) {
            word[i] = svar.charAt(i);
            solutionMasked[i] = '*';
        }



        while (corect == false) {


                String Guess = JOptionPane.showInputDialog("gita orði"+ reveald);

                for (int a = 0; a < svar.length(); a++) {

                    if (Guess.charAt(0) == word[a]) {
                        solutionMasked[a] = svar.charAt(a);

                    }
                    if(solutionMasked.equals(reveald)){

                        corect = true;
                    }
                }
                reveald.remove(true);
                for ( int i = 0 ; i < svar.length(); i++){
                    reveald.add(solutionMasked[i]);

                }

        }

    }
}