package D20210723;

/**
 * 169. Majority Element
 */
public class Q0169 {

    public int majorityElement(int[] nums) {

        int majority = nums[0];
        int count = 1;

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i] == majority) count++;
            else count--;

            if(count == 0) {
                majority = nums[i];
                count = 1;
            }
        }

        return majority;
    }
}
