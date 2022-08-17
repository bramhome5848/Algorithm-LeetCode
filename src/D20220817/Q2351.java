package D20220817;

import java.util.HashSet;
import java.util.Set;

/**
 * 2351. First Letter to Appear Twice
 */
public class Q2351 {

    public char repeatedCharacter(String s) {

        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()) {
           if(set.contains(c)) return c;
           set.add(c);
        }

        return 'c';
    }
}
