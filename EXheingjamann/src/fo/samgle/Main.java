package fo.samgle;

import javax.swing.*;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {
        String Word = JOptionPane.showInputDialog("inset or sum skal brúkast til heingja mann, hettar orði skal ikki hava millurúm");

        char[] word = new char[Word.length()];

        for (int j = 0; j < Word.length(); j++) {

            word[j] = Word.charAt(j);
        }

        char[] vord = new char[Word.length()];

        for (int j = 0; j < Word.length(); j++) {

            vord[j] = '*';
        }
        System.out.println(Word);
        int t = Word.length();

        for (int i = 0; i <= 10; i++) {

            String Guess = JOptionPane.showInputDialog("gita orði");


            for (int a = 0; a < Word.length(); a++) {



                if (Guess.charAt(0) == word[a]) {

                    vord[a] = Word.charAt(a);

                    System.out.println(vord);
                    
                }

            }

        }

    }

}