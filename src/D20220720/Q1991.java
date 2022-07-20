package D20220720;

/**
 * 1991. Find the Middle Index in Array
 */
public class Q1991 {

    public int findMiddleIndex(int[] nums) {

        for(int i=1 ; i<nums.length ; i++) nums[i] += nums[i-1];
        if(nums[nums.length-1] - nums[0] == 0) return 0;

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i-1] == nums[nums.length-1] - nums[i]) return i;
        }

        return -1;
    }
}
