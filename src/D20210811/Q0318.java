package D20210811;

/**
 * 318. Maximum Product of Word Lengths
 */
public class Q0318 {

    //bit
    public int maxProduct(String[] words) {

        int[] bitValue = new int[words.length];
        int result = 0;

        for (int i = 0; i < words.length; i++) {
            int value = 0;
            for (int j = 0; j < words[i].length(); j++) {
                int index = words[i].charAt(j) - 'a';
                value |= 1 << index;
            }
            bitValue[i] = value;
        }

        for (int i = 0; i < bitValue.length - 1; i++) {
            for (int j = i + 1; j < bitValue.length; j++) {
                if ((bitValue[i] & bitValue[j]) == 0) {
                    result = Math.max(result, words[i].length() * words[j].length());
                }
            }
        }
        return result;
    }
}
