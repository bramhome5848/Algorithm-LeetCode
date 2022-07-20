package D20220721;

/**
 * 2000. Reverse Prefix of Word
 */
public class Q2000 {

    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();
        int idx = word.indexOf(ch);

        if(idx == -1) return word;
        for(int i=idx ; i>-1 ; i--) {
            result.append(word.charAt(i));
        }

        return result.append(word.substring(idx+1)).toString();
    }
}
