package D20220715;

import java.util.HashMap;
import java.util.Map;

/**
 * 1897. Redistribute Characters to Make All Strings Equal
 */
public class Q1897 {

    public boolean makeEqual(String[] words) {

        Map<Character, Integer> freq = new HashMap<>();

        for(String word : words) {
            for(char c : word.toCharArray()) {
               freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        for(Integer value : freq.values()) {
            if(value % words.length != 0) return false;
        }

        return true;
    }
}
