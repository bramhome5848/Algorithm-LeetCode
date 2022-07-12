package D20220712;

/**
 * 1827. Minimum Operations to Make the Array Increasing
 */
public class Q1827 {

    public int minOperations(int[] nums) {

        if(nums.length == 1) return 0;

        int result = 0;

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i] <= nums[i-1]) {
                result += nums[i-1] + 1 - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }

        return result;
    }
}
