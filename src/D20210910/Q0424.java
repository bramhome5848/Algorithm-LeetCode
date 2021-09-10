package D20210910;

/**
 * 424. Longest Repeating Character Replacement
 */
public class Q0424 {

    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int start = 0;
        int maxSize = 0;
        int maxCharCount = 0;

        for(int i=0 ; i<s.length() ; i++) {
            freq[s.charAt(i) - 'A']++;
            maxCharCount = Math.max(maxCharCount, freq[s.charAt(i) - 'A']);

            while(i-start+1-maxCharCount > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }
            maxSize = Math.max(maxSize, i-start+1);
        }
        return maxSize;
    }
}
