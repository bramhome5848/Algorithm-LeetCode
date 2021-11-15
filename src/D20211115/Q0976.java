package D20211115;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 */
public class Q0976 {

    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length-1;

        while(n >= 2) {
            if(nums[n-2]+nums[n-1] > nums[n]) return nums[n]+nums[n-1]+nums[n-2];
            else n--;
        }

        return 0;
    }
}
