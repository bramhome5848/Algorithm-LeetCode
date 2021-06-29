package D20210629;

/**
 * 66. Plus One
 */
public class Q0066 {

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1 ; i>-1 ; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        //[9] -> [0] -> [0, 1]
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
