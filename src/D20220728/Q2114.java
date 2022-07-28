package D20220728;

import java.util.StringTokenizer;

/**
 * 2114. Maximum Number of Words Found in Sentences
 */
public class Q2114 {

    public int mostWordsFound(String[] sentences) {

        int result = 0;

        for(String sentence : sentences) {
            StringTokenizer token = new StringTokenizer(sentence);
            result = Math.max(result, token.countTokens());
        }

        return result;
    }
}
