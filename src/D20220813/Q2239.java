package D20220813;

/**
 * 2239. Find Closest Number to Zero
 */
public class Q2239 {

    public int findClosestNumber(int[] nums) {

        int result = nums[0];

        for(int num : nums) {
           if(Math.abs(num) < Math.abs(result)) result = num;
           else if(Math.abs(num) == Math.abs(result) && result < num) result = num;
        }

        return result;
    }
}
