package D20210625;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 */
public class Q0034 {

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            if(nums[left] < target) left++;
            else if(nums[left] == target) result[0] = left;

            if(target < nums[right]) right--;
            else if(nums[right] == target) result[1] = right;

            if(result[0] != -1 && result[1] != -1) break;
        }
        return result;
    }
}
