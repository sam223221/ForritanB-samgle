package fo.samgle;

import java.util.Set;
import java.util.TreeSet;

public class WrongGuessesCounter {
    public Integer Count(String solution, Set<Character> guesses) {
        TreeSet<Character> solutionSet = new TreeSet();
        TreeSet<Character> wrongGuessesSet = new TreeSet();

        for (int i = 0; i < solution.length(); i++) {
            solutionSet.add(Character.toUpperCase(solution.charAt(i)));
            solutionSet.add(Character.toLowerCase(solution.charAt(i)));
        }
        wrongGuessesSet.addAll(guesses);
        wrongGuessesSet.removeAll(solutionSet);
        return wrongGuessesSet.size();
    }
}