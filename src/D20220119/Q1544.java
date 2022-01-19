package D20220119;

/**
 * 1544. Make The String Great
 */
public class Q1544 {

    public String makeGood(String s) {

        StringBuilder result = new StringBuilder(s);

        for(int i=0 ; i<s.length() ; ) {
            if(s.charAt(i) - s.charAt(i+1) == 32) {
                result.delete(i, i + 2);
                i= Math.max(i - 1, 0);
            } else {
                i++;
            }
        }

        return result.toString();
    }
}
