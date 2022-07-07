package D20220707;

import java.util.HashSet;
import java.util.Set;

/**
 * 1684. Count the Number of Consistent Strings
 */
public class Q1684 {

    public int countConsistentStrings(String allowed, String[] words) {

        Set<Character> set = new HashSet<>();
        int result = words.length;

        for(char c : allowed.toCharArray()) set.add(c);

        for(String word : words) {
            for(char c : word.toCharArray()) {
               if(!set.contains(c)) {
                   result--;
                   break;
               }
            }
        }

        return result;
    }
}
