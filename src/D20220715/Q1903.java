package D20220715;

/**
 * 1903. Largest Odd Number in String
 */
public class Q1903 {

    public String largestOddNumber(String num) {

        int index = -1;

        for(int i=num.length()-1 ; i>-1 ; i--) {
            if((num.charAt(i) - '0') % 2 == 1) {
                index = i;
                break;
            }
        }

        return index == -1 ? "" : num.substring(0, index);
    }
}
