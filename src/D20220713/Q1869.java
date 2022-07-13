package D20220713;

import java.util.Arrays;

/**
 * 1869. Longer Contiguous Segments of Ones than Zeros
 */
public class Q1869 {

    public boolean checkZeroOnes(String s) {

        int maxZ = 0;
        int maxO = 0;
        int currZ = 0;
        int currO = 0;

        for(char c : s.toCharArray()) {
           if(c == '0') {
               currZ++;
               maxZ = Math.max(maxZ, currZ);
               currO = 0;
           } else {
               currO++;
               maxO = Math.max(maxO, currO);
               currZ = 0;
           }
        }

        return maxO > maxZ;
    }
}
