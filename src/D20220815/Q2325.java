package D20220815;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2325. Decode the Message
 */
public class Q2325 {

    public String decodeMessage1(String key, String message) {

        StringBuilder result = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        int idx = 0;

        for(char c : key.toCharArray()) {
            if(c == ' ') continue;
            if(!map.containsKey(c)) map.put(c, (char)(idx++ + 'a'));
        }

        for(char c : message.toCharArray()) {
           if(Character.isLowerCase(c)) result.append(map.get(c));
           else result.append(' ');
        }

        return result.toString();
    }

    public String decodeMessage(String key, String message) {

        StringBuilder result = new StringBuilder();
        int[] map = new int[26];
        int idx = 1;

        for(char c : key.toCharArray()) {
            if(c == ' ') continue;
            if(map[c - 'a'] == 0) map[c - 'a'] = idx++;
        }

        for(char c : message.toCharArray()) {
            if(Character.isLowerCase(c)) result.append((char)(map[c - 'a'] - 1 + 'a'));
            else result.append(' ');
        }

        return result.toString();
    }
}
