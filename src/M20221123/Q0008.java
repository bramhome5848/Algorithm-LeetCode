package M20221123;

/**
 * 8. String to Integer (atoi)
 */
public class Q0008 {

    public int myAtoi(String s) {
        int result = 0;
        int sIdx = 0;

        s = s.trim();

        if(s.startsWith("-") || s.startsWith("+")) sIdx++;

        for(int i=sIdx ; i<s.length() ; i++) {
            int num = s.charAt(i) - '0';
            if(0 <= num && num < 10) {
                if((Integer.MAX_VALUE - num) / 10 < result) { // check result * 10 + num > Integer.MAX_VALUE
                    return s.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + num;
            } else break;
        }

        return s.startsWith("-") ? -1 * result : result;
    }
}
