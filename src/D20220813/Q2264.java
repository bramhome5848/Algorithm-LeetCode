package D20220813;

/**
 * 2264. Largest 3-Same-Digit Number in String
 */
public class Q2264 {

    public String largestGoodInteger(String num) {

        char result = 47;  //asci

        for(int i=0 ; i<num.length()-2 ; i++) {
            if(num.charAt(i) == num.charAt(i+1)
                    && num.charAt(i+1) == num.charAt(i+2)) {
                if(result < num.charAt(i)) result = num.charAt(i);
            }
        }

        return result == 47 ? "" : String.valueOf(result).repeat(3);
    }
}
