package D20211102;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * 748. Shortest Completing Word
 */
public class Q0748 {

    public String shortestCompletingWord(String licensePlate, String[] words) {

        int length = Integer.MAX_VALUE;
        int idx = -1;
        StringBuilder sb = new StringBuilder();

        for(char c : licensePlate.toCharArray()) {
            if(Character.isLetter(c)) sb.append(Character.toLowerCase(c));
        }

        for(int i=0 ; i<words.length ; i++) {
            if(words[i].length() < length && matches(sb.toString(), words[i])) {
                idx = i;
                length = words[i].length();
            }
        }
        return words[idx];
    }

    private boolean matches(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] freq = new int[26];

        for(char c : s2.toCharArray()) freq[c-'a']++;
        for(char c : s1.toCharArray()) {
           if(freq[c-'a'] == 0) return false;
            freq[c-'a']--;
        }
        return true;
    }
}
