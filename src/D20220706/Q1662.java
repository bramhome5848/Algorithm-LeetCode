package D20220706;

import java.util.Arrays;

/**
 * 1662. Check If Two String Arrays are Equivalent
 */
public class Q1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        Arrays.stream(word1).forEach(sb1::append);
        Arrays.stream(word2).forEach(sb2::append);

        return sb1.toString().equals(sb2.toString());
    }
}
