package D20210803;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. Word Pattern
 */
public class Q0290 {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        wordPattern(pattern, s);
    }
    public static boolean wordPattern(String pattern, String s) {

        String[] data = s.split(" ");
        if(pattern.length() != data.length) return false;

        Map<String, Character> map = new HashMap<>();

        for(int i=0 ; i<pattern.length() ; i++) {

            if(map.containsKey(data[i])
                    && map.get(data[i]) != pattern.charAt(i)) return false;

            if(!map.containsKey(data[i])) {
                if(map.containsValue(pattern.charAt(i))) return false;
                map.put(data[i], pattern.charAt(i));
            }
            map.put(data[i], pattern.charAt(i));
        }

        return true;
    }
}
