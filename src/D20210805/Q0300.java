package D20210805;

import java.util.Arrays;

/**
 * 300. Longest Increasing Subsequence
 */
public class Q0300 {

    public int lengthOfLIS(int[] nums) {

        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        for(int i=1 ; i<nums.length ; i++) {
            for(int j=0 ; j<i ; j++) {
                if(nums[j] < nums[i]) result[i] = Math.max(result[i], result[j] + 1);
            }
        }

        return Arrays.stream(result).max().orElse(0);
    }
}
