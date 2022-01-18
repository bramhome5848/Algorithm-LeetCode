package D20220118;

/**
 * 1470. Shuffle the Array
 */
public class Q1470 {

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        int idx = 0;
        int length = nums.length / 2;

        for(int i=0 ; i<length ; i++) {
            result[idx++] = nums[i];
            result[idx++] = nums[i + length];
        }

        return result;
    }
}
