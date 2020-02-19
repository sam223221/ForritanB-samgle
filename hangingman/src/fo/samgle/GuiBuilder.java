package fo.samgle;

import javax.swing.*;
import java.util.Set;
import java.util.SortedSet;

public class GuiBuilder {
    private final WrongGuessesCounter _wrongGuessesCounter;
    public GuiBuilder(WrongGuessesCounter wrongGuessesCounter) {
        _wrongGuessesCounter = wrongGuessesCounter;
    }

    public String getGUI(String solution, Set<Character> guessed) {

        int rattGit = solution.length();
        int rætttelja = 0;
        int skeiftGit = 0;
        char[] word = new char[solution.length()];

        for (int i = 0; i < solution.length(); i++) {
            word[i] = solution.charAt(i);
        }

        char[] solutionMasked = new char[solution.length()];

        for (int i = 0; i < solution.length(); i++) {
            solutionMasked[i] = '*';
        }

        System.out.println(solution);
        System.out.println(solutionMasked);


        for (int i = 0; i <= solution.length() + 5; i++) {
            String Guess = JOptionPane.showInputDialog("gita orði");
            skeiftGit++;
            for (int a = 0; a < solution.length(); a++) {
                if (Guess.charAt(0) == word[a]) {
                    solutionMasked[a] = solution.charAt(a);

                    rætttelja++;
                    skeiftGit--;


                }
            }
            System.out.println(solutionMasked);
            System.out.println(skeiftGit);
            if (rætttelja == rattGit) {
                return;
            }
            if (skeiftGit == 5) {
                return;
            }
        }
    }
}