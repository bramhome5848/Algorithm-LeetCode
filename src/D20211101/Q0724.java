package D20211101;

import java.util.Arrays;

/**
 * 724. Find Pivot Index
 */
public class Q0724 {

    public int pivotIndex(int[] nums) {

        int left = 0;
        int sum = 0;

        for(int num : nums) sum += num;
        for(int i=0 ; i<nums.length ; i++) {
            if(left == sum-left-nums[i]) return i;
            left += nums[i];
        }

        return -1;
    }
}
