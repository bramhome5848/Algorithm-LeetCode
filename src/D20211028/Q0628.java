package D20211028;

import java.util.Arrays;

/**
 * 628. Maximum Product of Three Numbers
 */
public class Q0628 {

    public int maximumProduct1(int[] nums) {

        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[0] * nums[1] * nums[length-1],
                nums[length-1] * nums[length-2] * nums[length-3]);
    }

    public int maximumProduct2(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : nums) {
            if(num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(num > max2) {
                max3 = max2;
                max2 = num;
            } else if(num > max3) {
                max3 = num;
            }

            if(min1 > num) {
                min2 = min1;
                min1 = num;
            } else if(min2 > num) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
