package D20210622;

import java.util.*;

/**
 * 16. 3Sum Closest
 */
public class Q0016 {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];

        for (int i=0 ; i<nums.length-2 ; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = target - sum;
                if (Math.abs(target - result) > Math.abs(diff)) result = sum;

                if (diff > 0) j++;
                else if(diff < 0) k--;
                else return target;
            }
        }

        return result;
    }
}
