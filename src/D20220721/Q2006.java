package D20220721;

import java.util.HashMap;
import java.util.Map;

/**
 * 2006. Count Number of Pairs With Absolute Difference K
 */
public class Q2006 {

    public int countKDifference(int[] nums, int k) {
        if(nums.length < 2) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int num : nums) {
            if(map.containsKey(num + k)) result += map.get(num + k);
        }

        return result;
    }
}
