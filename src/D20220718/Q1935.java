package D20220718;

/**
 * 1935. Maximum Number of Words You Can Type
 */
public class Q1935 {

    public int canBeTypedWords(String text, String brokenLetters) {

        String[] textArray = text.split("\\s");
        int[] freq = new int[26];
        int result = textArray.length;

        for(char c : brokenLetters.toCharArray()) freq[c - 'a']++;

        for(String t : textArray) {
            for(char c : t.toCharArray()) {
               if(freq[c - 'a'] > 0) {
                   result--;
                   break;
               }
            }
        }

        return result;
    }
}
