package D20211118;

import java.util.HashMap;
import java.util.Map;

/**
 * 1189. Maximum Number of Balloons
 */
public class Q1189 {

    //balloon
    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(char c : text.toCharArray()) {
            if(c == 'b' || c == 'a' || c == 'n') map.put(c, map.getOrDefault(c, 0) + 2);
            else if(c == 'l' || c == 'o') map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            min = Math.min(min, e.getValue());
        }

        return map.size() < 5 ? 0 : min / 2;
    }
}
