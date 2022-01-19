package D20220119;

import java.util.Arrays;

/**
 * 1502. Can Make Arithmetic Progression From Sequence
 */
public class Q1502 {

    public boolean canMakeArithmeticProgression1(int[] arr) {

        Arrays.sort(arr);

        int diff = arr[1] - arr[0];
        for(int i=2 ; i<arr.length ; i++) {
            if(arr[i] - arr[i-1] != diff) return false;
        }

        return true;
    }
}
