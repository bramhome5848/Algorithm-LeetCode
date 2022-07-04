package D20220704;

import java.util.*;

/**
 * 1624. Largest Substring Between Two Equal Characters
 */
public class Q1624 {

    public int maxLengthBetweenEqualCharacters(String s) {

        int[] freq = new int[26];
        int result = -1;

        Arrays.fill(freq, -1);

        for(int i=0 ; i<s.length() ; i++) {
            if(freq[s.charAt(i) - 'a'] == -1) {
                freq[s.charAt(i) - 'a'] = i;
            } else {
                result = Math.max(result, i - freq[s.charAt(i) - 'a'] -1);
            }
        }

        return result;
    }
}
