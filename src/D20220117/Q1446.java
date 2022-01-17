package D20220117;

/**
 * 1446. Consecutive Characters
 */
public class Q1446 {

    public int maxPower(String s) {

        int result = 0;
        int length = 1;
        char bef = s.charAt(0);

        for(int i=1 ; i<s.length() ; i++) {
            if(bef == s.charAt(i)) length++;
            else {
                bef = s.charAt(i);
                length = 1;
            }

            result = Math.max(result, length);
        }
        return result;
    }
}
