package D20210802;

import java.util.Arrays;

/**
 * 268. Missing Number
 */
public class Q0268 {

    //only O(1) extra space complexity and O(n) runtime
    public int missingNumber(int[] nums) {

        int all = nums.length * (nums.length+1) / 2;
        int sum = 0;

        for (int num : nums) sum += num;

        return all - sum;
    }
}
