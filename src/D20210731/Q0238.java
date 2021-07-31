package D20210731;

/**
 * 238. Product of Array Except Self
 */
public class Q0238 {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int right = 1;
        result[0] = 1;

        for(int i=1 ; i<result.length ; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        for(int i=nums.length-1 ; i>-1 ; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }
}
