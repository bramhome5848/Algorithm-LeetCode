package D20210726;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 */
public class Q0205 {

    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for(int i=0 ; i<s.length() ; i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            if(!map.containsKey(key)) {
                if(!map.containsValue(value)) {
                    map.put(key, value);
                } else return false;
            } else if(map.get(key) != value) {
                return false;
            }
        }

        return true;
    }
}
