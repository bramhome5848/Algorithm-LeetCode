package D20220814;

/**
 * 2287. Rearrange Characters to Make Target String
 */
public class Q2287 {

    public int rearrangeCharacters(String s, String target) {

        int[] sFreq = new int[26];
        int[] tFreq = new int[26];
        int count = s.length();

        for(char c : s.toCharArray()) sFreq[c - 'a']++;
        for(char c : target.toCharArray()) tFreq[c - 'a']++;
        for(char c : target.toCharArray()) {
            count = Math.min(count, sFreq[c - 'a'] / tFreq[c - 'a']);
        }

        return count;
    }
}
