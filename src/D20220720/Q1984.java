package D20220720;

import java.util.Arrays;

/**
 * 1984. Minimum Difference Between Highest and Lowest of K Scores
 */
public class Q1984 {

    public int minimumDifference(int[] nums, int k) {

        if(k <  2) return 0;

        Arrays.sort(nums);
        int result = nums[nums.length-1] - nums[0];

        for(int i=k-1 ; i<nums.length ; i++) {
            result = Math.min(result, nums[i] - nums[i-k+1]);
        }

        return result;
    }
}
