package D20211115;

import java.util.Arrays;

/**
 * 1005. Maximize Sum Of Array After K Negations
 */
public class Q1005 {

    public int largestSumAfterKNegations(int[] nums, int k) {

        int idx = 0;
        int count = 0;

        Arrays.sort(nums);

        while(idx<nums.length && nums[idx]<0 && count<k) {
            nums[idx] = -nums[idx];
            idx++;
            count++;
        }

        if(idx<nums.length && nums[idx] == 0) return Arrays.stream(nums).sum();

        Arrays.sort(nums);

        while(count < k) {
            nums[0] = -nums[0];
            count++;
        }

        return Arrays.stream(nums).sum();
    }
}
