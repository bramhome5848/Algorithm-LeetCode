package D20220817;

import java.util.HashSet;
import java.util.Set;

/**
 * 2367. Number of Arithmetic Triplets
 */
public class Q2367 {

    public int arithmeticTriplets1(int[] nums, int diff) {

        int result = 0;

        for(int i=0 ; i<nums.length ; i++) {
            for(int j=i+1 ; j<nums.length ; j++) {
                for(int k=j+1 ; k<nums.length ; k++) {
                    if(nums[j] - nums[i] == diff
                            && nums[k] - nums[j] == diff) result++;
                }
            }
        }

        return result;
    }

    public int arithmeticTriplets2(int[] nums, int diff) {

        Set<Integer> set = new HashSet<>();
        int result = 0;

        for(int num : nums) set.add(num);
        for(int num : nums) {
            if (set.contains(num - diff) && set.contains(num + diff)) result++;
        }

        return result;
    }
}
