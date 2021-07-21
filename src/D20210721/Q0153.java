package D20210721;

/**
 * 153. Find Minimum in Rotated Sorted Array
 */
public class Q0153 {

    public int findMin(int[] nums) {

        if(nums.length == 1) return nums[0];
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = (start + end) / 2;

            if(nums[end] < nums[mid]) start = mid + 1;
            else end = mid;
        }
        return nums[start];
    }
}
