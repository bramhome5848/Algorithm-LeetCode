package D20210721;

/**
 * 152. Maximum Product Subarray
 */
public class Q0152 {

    public int maxProduct(int[] nums) {

        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int result = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];

        for(int i=1 ; i<nums.length ; i++) {
            int temp = maxSoFar;

            maxSoFar = Math.max(nums[i], Math.max(maxSoFar * nums[i], minSoFar * nums[i]));
            minSoFar = Math.min(nums[i], Math.min(temp * nums[i], minSoFar * nums[i]));
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}
