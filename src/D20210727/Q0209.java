package D20210727;

/**
 * 209. Minimum Size Subarray Sum
 */
public class Q0209 {

    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for(int right = 0 ; right<nums.length ; right++) {
            sum += nums[right];

            while(sum >= target) {
                minSize = Math.min(minSize, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}
