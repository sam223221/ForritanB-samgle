package fo.samgle;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GameOverChecker {
    private final WrongGuessesCounter _wrongGuessesCounter;

    public GameOverChecker(WrongGuessesCounter wrongGuessesCounter) {
        _wrongGuessesCounter = wrongGuessesCounter;
    }

    public GameState CheckIfGameIsOver(String solution, Set<Character> guesses) {
        GameState result = GameState.INIT;
        TreeSet<Character> solutionAsUpperCase = new TreeSet();
        TreeSet<Character> guessesAsUpperCase = new TreeSet();
        Iterator<Character> guessesIterator = guesses.iterator();
        while (guessesIterator.hasNext()) {
            guessesAsUpperCase.add(Character.toUpperCase(guessesIterator.next()));
        }
        for (int i = 0; i < solution.length(); i++) {
            solutionAsUpperCase.add(solution.toUpperCase().charAt(i));
        }

        solutionAsUpperCase.removeAll(guessesAsUpperCase); // remove all guessed characters - if any remaining, then game is not done.

        if (solutionAsUpperCase.isEmpty()) {
            result = GameState.GAME_OVER_WIN;
        } else {
            if (_wrongGuessesCounter.Count(solution, guesses) > 4) {
                result = GameState.GAME_OVER_LOST;
            } else {
                result = GameState.IN_PROGRESS;
            }
        }
        return result;
    }
}