package D20220720;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1995. Count Special Quadruplets
 */
public class Q1995 {

    public int countQuadruplets(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int i=1 ; i<nums.length ; i++) {
            for(int j=0 ; j<i ; j++) {
                map.put(nums[i] + nums[j], map.getOrDefault(nums[i] + nums[j], 0) + 1);
            }

            for(int k=i+2 ; k<nums.length ; k++) {
                result += map.getOrDefault(nums[k] - nums[i+1], 0);
            }
        }

        return result;
    }
}
