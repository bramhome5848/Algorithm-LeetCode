package D20211115;

import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array
 */
public class Q0977 {

    public int[] sortedSquares1(int[] nums) {
        return Arrays.stream(nums).map(s -> s * s).sorted().toArray();
    }

    public int[] sortedSquares2(int[] nums) {

        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int idx = nums.length - 1;

        while(left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[idx] = nums[left] * nums[left];
                left++;
            } else {
                result[idx] = nums[right] * nums[right];
                right--;
            }
            idx--;
        }
        return result;
    }
}
