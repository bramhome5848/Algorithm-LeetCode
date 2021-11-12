package D20211112;

import java.util.HashMap;
import java.util.Map;

/**
 * 953. Verifying an Alien Dictionary
 */
public class Q0953 {

    public boolean isAlienSorted(String[] words, String order) {

        Map<Character, Integer> map = new HashMap<>();
        String prev = words[0];

        for(int i=0 ; i<order.length() ; i++) map.put(order.charAt(i), i);

        for(int i=1 ; i<words.length ; i++) {
            String word = words[i];
            int idx = 0;

            while(idx < word.length() && idx < prev.length()) {
                if(word.charAt(idx) != prev.charAt(idx)) {
                    if(map.get(word.charAt(idx)) < map.get(prev.charAt(idx))) return false;
                    else break;
                }
                idx++;
            }

            if(idx == word.length() && idx < prev.length()) return false;
            prev = word;
        }

        return true;
    }
}
