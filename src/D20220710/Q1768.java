package D20220710;

/**
 * 1768. Merge Strings Alternately
 */
public class Q1768 {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int idx1 = 0;
        int idx2 = 0;

        while(idx1 < word1.length() && idx2 < word2.length()) {
            result.append(word1.charAt(idx1++));
            result.append(word2.charAt(idx2++));
        }

        if(idx1 < word1.length()) addRemain(word1, result, idx1);
        if(idx2 < word2.length()) addRemain(word2, result, idx2);

        return result.toString();
    }

    private void addRemain(String word, StringBuilder result, int idx) {
        for(int i=idx ; i<word.length() ; i++) result.append(word.charAt(i));
    }
}
