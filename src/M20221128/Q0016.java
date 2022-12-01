package M20221128;

import java.util.Arrays;

/**
 * 16. 3Sum Closest
 */
public class Q0016 {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];

        for(int i=0 ; i<nums.length-2 ; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(Math.abs(target - sum) < Math.abs(target - result)) result = sum;
                if(sum > target) k--;
                else if(sum < target) j++;
                else return target;
            }
        }

        return result;
    }

    private void test() {
        System.out.println("git test");
    }
}
