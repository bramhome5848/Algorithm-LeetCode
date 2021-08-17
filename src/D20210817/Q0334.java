package D20210817;

/**
 * 334. Increasing Triplet Subsequence
 */
public class Q0334 {

    //O(n) time complexity and O(1) space complexity
    public boolean increasingTriplet(int[] nums) {

        if(nums == null || nums.length < 3) return false;

        int next = Integer.MAX_VALUE;   //최소 값 보다 큰 다음 값
        int min = nums[0];  //가장 작은 값

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i] < min) min = nums[i];
            else if(min < nums[i] && nums[i] <= next) next = nums[i];
            else if(nums[i] > next) return true;
        }

        return false;
    }
}
