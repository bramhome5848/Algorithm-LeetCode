package D20220720;

import java.util.Arrays;

/**
 * 1979. Find Greatest Common Divisor of Array
 */
public class Q1979 {

    public int findGCD1(int[] nums) {
        Arrays.sort(nums);
        return getGcd(nums[0], nums[nums.length-1]);
    }

    private int getGcd(int a, int b) {
        if(a % b == 0) return b;
        return getGcd(b, a % b);
    }

    public int findGCD2(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return getGcd(min, max);
    }
}
