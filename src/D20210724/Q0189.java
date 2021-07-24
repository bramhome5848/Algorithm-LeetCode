package D20210724;

/**
 * 189. Rotate Array
 */
public class Q0189 {

    public void rotate(int[] nums, int k) {

        int[] result = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++) {
            int idx = (i+k)%nums.length;
            result[idx] = nums[i];
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
