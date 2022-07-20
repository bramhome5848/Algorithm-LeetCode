package D20220721;

/**
 * 2016. Maximum Difference Between Increasing Elements
 */
public class Q2016 {

    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int result = -1;

        for(int num : nums) {
            if(min < num) result = Math.max(result, num - min);
            min = Math.min(min, num);
        }

        return result;
    }
}
