package D20220706;

/**
 * 1668. Maximum Repeating Substring
 */
public class Q1668 {

    public int maxRepeating(String sequence, String word) {

        if(sequence.length() < word.length()) return 0;

        int result = 0;

        for(int i=0 ; i<sequence.length() - word.length() + 1 ; i++) {
            int count = 0;
            int idx = 0;
            for(int j=i ; j<sequence.length() ; j++) {
                if(sequence.charAt(j) == word.charAt(idx)) idx++;
                else break;
                if(idx == word.length()) {
                    idx = 0;
                    count++;
                }
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
