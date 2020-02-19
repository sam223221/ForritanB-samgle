package fo.samgle;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        NameAsker nameAsker = new NameAsker();
        GuessGenerator guessGenerator = new GuessGenerator();
        GuiBuilder guiBuilder = new GuiBuilder(new WrongGuessesCounter());
        GuessAsker guessAsker = new GuessAsker();
        GameOverChecker gameOverChecker = new GameOverChecker(new WrongGuessesCounter());
        Scanner scanner = new Scanner(System.in);

        GameState gameState = GameState.INIT;
        String solution = "";
        Set<Character> guessed = new TreeSet();

        String name = nameAsker.WhatIsYourName();
        while (true) {
            switch (gameState) {
                case INIT:
                    solution = guessGenerator.GenerateGuess();
                    guessed = new TreeSet();
                    gameState = GameState.IN_PROGRESS;
                    break;
                case IN_PROGRESS:
                    System.out.println(guiBuilder.getGUI(solution, guessed));
                    guessed = guessAsker.GuessACharacter(guessed);
                    gameState = gameOverChecker.CheckIfGameIsOver(solution, guessed);
                    break;
                case GAME_OVER_WIN:
                    System.out.println(guiBuilder.getGUI(solution, guessed));
                    System.out.println("TIL LUKKU!! - TÚ HEVUR VUNNIÐ :)");
                    System.out.println("Trýst á ENTER fyri at spæla umaftur.");
                    scanner.nextLine();
                    gameState = GameState.INIT;
                    break;
                case GAME_OVER_LOST:
                    System.out.println(guiBuilder.getGUI(solution, guessed));
                    System.out.println("GAME OVER!! - TÚ TAPTI :(");
                    System.out.println("Loysnin var " + solution);
                    System.out.println("Trýst á ENTER fyri at spæla umaftur.");
                    scanner.nextLine();
                    gameState = GameState.INIT;
                    break;
            }
        }
    }
}