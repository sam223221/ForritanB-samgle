package fo.samgle;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GuessAsker {
    public Set<Character> GuessACharacter(Set<Character> alreadyGuessed) {
        TreeSet<Character> result = new TreeSet();
        result.addAll(alreadyGuessed);
        System.out.println("Gita ein stav:");
        Scanner scanner = new Scanner(System.in);
        String guessString = scanner.next();
        Character guessChar = guessString.charAt(0);
        while (alreadyGuessed.contains(guessChar) == true) {
            System.out.println("\nStavur er longu gittur. Royn aftur:");
            guessString = scanner.next();
            guessChar = guessString.charAt(0);
        }
        result.add(guessChar);
        return result;
    }
}