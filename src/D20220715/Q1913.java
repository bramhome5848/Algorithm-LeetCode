package D20220715;

import java.util.*;

/**
 * 1913. Maximum Product Difference Between Two Pairs
 */
public class Q1913 {

    public int maxProductDifference(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length-1] * nums[nums.length-2] - nums[0] * nums[1];
    }
}
