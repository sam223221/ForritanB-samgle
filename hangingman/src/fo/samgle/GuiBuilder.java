package fo.samgle;

import java.util.*;

public class GuiBuilder {
    private final WrongGuessesCounter _wrongGuessesCounter;

    public GuiBuilder(WrongGuessesCounter wrongGuessesCounter) { _wrongGuessesCounter = wrongGuessesCounter;
    }
/*
    public String getGuiBuilder(String solution, set<Character> guessed ){
        return GuiBuilder.getGUI(solution,  ConvertSetToArrayList(Set<Character>));

    }
*/
    public String getGUI(String solution, Set<Character> guessed) {

        String solutionMasked = "";

            for (int i = 0 ; i < solution.length() ; i++) {
                char cUpp = Character.toUpperCase(solution.charAt(i));
                char cDown = Character.toLowerCase(solution.charAt(i));
                if (guessed.contains(cDown)||guessed.contains(cUpp)){
                    solutionMasked = solutionMasked + solution.charAt(i);
                }else{
                    solutionMasked = solutionMasked + "*";
                }
            }
            ;
        return "loysn:"+ solutionMasked+"\n"+
                "git :"+ guessed.toString()+"\n"+
                "skeiv git " + _wrongGuessesCounter.Count(solution, guessed);
    }


    static ArrayList<Character> ConvertSetToArrayList(Set<Character> characterSet) {
        ArrayList<Character> result = new ArrayList();
        Iterator<Character> iterator = characterSet.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

    static Set<Character> ConvertArrayListToSet(List<Character> characterList) {
        Set<Character> result = new TreeSet();
        for (int i = 0; i < characterList.size(); i++) {
            result.add(characterList.get(i));
        }
        return result;
    }
}