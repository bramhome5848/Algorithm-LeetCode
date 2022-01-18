package D20220118;

/**
 * 1480. Running Sum of 1d Array
 */
public class Q1480 {

    public int[] runningSum(int[] nums) {

        for(int i=1 ; i<nums.length ; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
