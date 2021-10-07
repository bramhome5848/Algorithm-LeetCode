package D20211007;

import java.util.Arrays;

/**
 * 467. Unique Substrings in Wraparound String
 */
public class Q0467 {

    public int findSubstringInWraproundString(String p) {

        if(p.length() < 2) return p.length();

        int[] freq = new int[26];
        int maxL = 1;

        for(int i=0 ; i<p.length() ; i++) {
            if(i>0 && (p.charAt(i) - p.charAt(i-1) == 1 || p.charAt(i-1) - p.charAt(i) == 25)) maxL++;
            else maxL = 1;

            int idx = p.charAt(i) - 'a';
            freq[idx] = Math.max(freq[idx], maxL);
        }

        return Arrays.stream(freq).sum();
    }
}
