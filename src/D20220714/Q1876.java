package D20220714;

import java.util.HashSet;
import java.util.Set;

/**
 * 1876. Substrings of Size Three with Distinct Characters
 */
public class Q1876 {

    public int countGoodSubstrings(String s) {

        if(s.length() < 3) return 0;

        int result = 0;

        for(int i=0 ; i<s.length()-2 ; i++) {
            if(s.charAt(i) != s.charAt(i+1)
                    && s.charAt(i) != s.charAt(i+2)
                    && s.charAt(i+1) != s.charAt(i+2)) result++;
        }

        return result;
    }
}
