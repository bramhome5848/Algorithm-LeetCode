package D20211119;

import java.util.Stack;

/**
 * 1221. Split a String in Balanced Strings
 */
public class Q1221 {

    //equal quantity of 'L' and 'R'
    public int balancedStringSplit(String s) {

        int cntR = 0;
        int cntL = 0;
        int result = 0;

        for(char c : s.toCharArray()) {
           if(c == 'R') cntR++;
           else cntL++;

           if(cntR == cntL) result++;
        }

        return result;
    }
}
