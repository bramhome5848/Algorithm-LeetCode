package D20210616;

import java.util.Arrays;

/**
 * 1. Two Sum
 */
public class Q0001 {

    public int[] twoSum(int[] nums, int target) {
        for(int i=0 ; i<nums.length ; i++) {
            for(int j=i+1 ; j<nums.length ; j++) {
                if(nums[i]+nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}
