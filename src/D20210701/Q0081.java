package D20210701;

/**
 * 81. Search in Rotated Sorted Array II
 */
public class Q0081 {

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        System.out.println(search(nums, 1));
    }
    public static boolean search(int[] nums, int target) {
        return exists(nums, 0, nums.length-1, target);
    }

    public static boolean exists(int[] nums, int left, int right, int target) {

        if(right < left) return false;

        int mid = (left + right) / 2;
        if(nums[mid] == target) return true;

        if(nums[mid] < target && target <= nums[right]) {
            return exists(nums, mid+1, right, target);
        }

        if(nums[left] <= target && target < nums[mid]) {
            return exists(nums, left, mid-1, target);
        }

        return exists(nums, left, mid-1, target) || exists(nums, mid+1, right, target);
    }
}
