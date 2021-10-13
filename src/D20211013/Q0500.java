package D20211013;

import java.util.ArrayList;
import java.util.List;

/**
 * 500. Keyboard Row
 */
public class Q0500 {

    private final String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    public String[] findWords(String[] words) {

        List<String> result = new ArrayList<>();

        for(String word : words) {

            String loWord = word.toLowerCase();
            int idx = 0;

            if(keyboard[1].indexOf(loWord.charAt(0)) > -1) idx = 1;
            else if(keyboard[2].indexOf(loWord.charAt(0)) > -1) idx = 2;

            if(isValid(loWord, idx)) result.add(word);
        }

        return result.toArray(String[]::new);
    }

    private boolean isValid(String word, int idx) {
        for(char c : word.toCharArray()) {
            if(keyboard[idx].indexOf(c) == -1) return false;
        }
        return true;
    }
}
