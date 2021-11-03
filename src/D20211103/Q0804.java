package D20211103;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class Q0804 {

    public int uniqueMorseRepresentations(String[] words) {

        String[] data = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--",
                "-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()) sb.append(data[c-'a']);
            set.add(sb.toString());
        }

        return set.size();
    }
}
