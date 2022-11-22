package M20221122;

/**
 * 6. Zigzag Conversion
 */
public class Q0006 {

    /** n = 2 -> (2 - 1) *  2 == 2
     * 00 02 04 06 08 10 12 14
     * 01 03 05 07 09 11 13
     */

    /** n = 3 -> (3 - 1) * 2 == 4
     * 00    04    08    12 -> 4
     * 01 03 05 07 09 11 13 -> 2 붙은 숫자 차이
     * 02    06    10    14 -> 4
     */

    /**
     * n = 4 -> (4 - 1) * 2 == 6
     * 00       06       12 -> 6
     * 01    05 07    11 13 -> 2 붙은 숫자 차이
     * 02 04    08 10    14 -> 2 붙은 숫자 차이
     * 03       09          -> 6
     */
    public String convert(String s, int numRows) {
        if(numRows < 2) return s;

        StringBuilder result = new StringBuilder();
        int diff = (numRows - 1) * 2;

        for(int i=0 ; i<numRows ; i++) {
            for(int j=i ; j<s.length() ; j+=diff) {
                result.append(s.charAt(j));
                if(0 < i && i < numRows - 1) {
                    int idx = j + diff - 2 * i;
                    if(idx < s.length()) result.append(s.charAt(idx));
                }
            }
        }

        return result.toString();
    }
}
