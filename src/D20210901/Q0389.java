package D20210901;

/**
 * 389. Find the Difference
 */
public class Q0389 {

    public char findTheDifference(String s, String t) {

        int[] freq = new int[26];
        for(char c : s.toCharArray()) freq[c - 'a']++;
        for(char c : t.toCharArray()){
            if(freq[c - 'a'] <= 0) return c;
            freq[c- 'a']--;
        }

        return 's';
    }
}
