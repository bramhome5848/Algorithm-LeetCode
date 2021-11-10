package D20211110;

import java.util.Arrays;

/**
 * 908. Smallest Range I
 */
public class Q0908 {

    public int smallestRangeI(int[] nums, int k) {

        int min = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return min+k >= max-k ? 0 : max-min-2*k;
    }
}
