package D20211007;

import java.util.Arrays;

/**
 * 462. Minimum Moves to Equal Array Elements II
 */
public class Q0462 {

    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int result = 0;
        int middle = n%2 != 0 ? nums[n/2] : (nums[n/2] + nums[n/2-1])/2;

        for(int num : nums) result += Math.abs(num - middle);

        return result;
    }
}
