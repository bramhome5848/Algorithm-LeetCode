package D20211029;

import java.util.Arrays;

/**
 * 674. Longest Continuous Increasing Subsequence
 */
public class Q0674 {

    public int findLengthOfLCIS(int[] nums) {

        int count = 1;
        int maxL = 1;

        for(int i=0 ; i<nums.length-1 ; i++) {

            if(nums[i] < nums[i+1]) count++;
            else count = 1;

            maxL = Math.max(maxL, count);
        }

        return maxL;
    }
}
