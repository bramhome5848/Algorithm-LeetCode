package D20210616;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 */
public class Q0003 {

    public int lengthOfLongestSubstring(String s) {

        if(s.length() < 2) return s.length();

        int i = 0;
        int j = 0;
        int result = 1;

        Set<Character> set = new HashSet<>();
        char[] data = s.toCharArray();
        set.add(data[0]);

        while(j < s.length()-1) {
            if(!set.contains(data[j+1])) {
                set.add(data[j+1]);
                j++;
                result = Math.max(result, j-i+1);
            } else {
                set.remove(data[i]);
                i++;
            }
        }

        return result;
    }
}
