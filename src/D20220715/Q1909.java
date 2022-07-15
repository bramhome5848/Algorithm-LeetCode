package D20220715;

/**
 * 1909. Remove One Element to Make the Array Strictly Increasing
 */
public class Q1909 {

    public boolean canBeIncreasing(int[] nums) {

        int count = 0;
        int prev = 0;

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i] <= nums[i-1]) {
                count++;
                prev = i;
            }

            if(count > 1) return false;
        }

        if(count == 0 || prev == 1 || prev == nums.length - 1) return true;

        return nums[prev + 1] > nums[prev - 1] || nums[prev] > nums[prev - 2];
    }
}
