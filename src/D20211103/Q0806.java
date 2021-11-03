package D20211103;

/**
 * 806. Number of Lines To Write String
 */
public class Q0806 {

    public int[] numberOfLines(int[] widths, String s) {

        int[] result = new int[2];  //[0] -> line, [1] -> lineSum;
        result[0] = 1;

        for(char c : s.toCharArray()) {
            if(result[1] + widths[c-'a'] > 100) {
                result[1] = widths[c-'a'];
                result[0]++;
            } else {
                result[1] += widths[c-'a'];
            }
        }

        return result;
    }
}
