package D20220809;

/**
 * 2185. Counting Words With a Given Prefix
 */
public class Q2185 {

    public int prefixCount(String[] words, String pref) {

        int result = 0;

        for(String word : words) {
           if(word.startsWith(pref)) result++;
        }

        return result;
    }
}
