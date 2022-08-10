package D20220810;

/**
 * 2210. Count Hills and Valleys in an Array
 */
public class Q2210 {

    public int countHillValley(int[] nums) {

        int result = 0;
        int prev = nums[0];

        for(int i=1 ; i<nums.length-1 ; i++) {
            if((prev < nums[i] && nums[i] > nums[i+1]) || (prev > nums[i] && nums[i] < nums[i+1])) {
                result++;
                prev = nums[i];
            }
        }

        return result;
    }
}
