package D20211118;

import java.util.HashMap;
import java.util.Map;

/**
 * 1160. Find Words That Can Be Formed by Characters
 */
public class Q1160 {

    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];
        int sum = 0;

        for(char c : chars.toCharArray()) freq[c-'a']++;
        for(String word : words) {
            if(wordCheck(word, 0, freq)) sum += word.length();
        }

        return sum;
    }

    private boolean wordCheck(String s, int idx, int[] freq) {

        if(idx >= s.length()) return true;
        if(freq[s.charAt(idx)-'a'] <= 0) return false;

        freq[s.charAt(idx)-'a']--;
        boolean result = wordCheck(s, idx+1, freq);
        freq[s.charAt(idx)-'a']++;

        return result;
    }
}
