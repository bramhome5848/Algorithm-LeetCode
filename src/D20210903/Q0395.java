package D20210903;

import java.util.HashSet;
import java.util.Set;

/**
 * 395. Longest Substring with At Least K Repeating Characters
 */
public class Q0395 {

    public int longestSubstring(String s, int k) {

        if(s.length() < k) return 0;

        Set<Character> invalid = new HashSet<>();
        int[] freq = new int[26];
        int max = 0;
        int prev = -1;

        for(char c : s.toCharArray()) freq[c - 'a']++;
        for(int i=0 ; i<26 ; i++) {
            if(0 < freq[i] && freq[i] < k) invalid.add((char)(i + 'a'));
        }

        if(invalid.size() == 0) return s.length();

        for(int i=0 ; i<s.length() ; i++) {
            if(invalid.contains(s.charAt(i))) {
                int subLength = longestSubstring(s.substring(prev+1, i), k);
                max = Math.max(max, subLength);
                prev = i;
            }
        }

        int subLength = longestSubstring(s.substring(prev + 1), k);
        return Math.max(max, subLength);
    }
}
