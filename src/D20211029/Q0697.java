package D20211029;

import java.util.HashMap;
import java.util.Map;

/**
 * 697. Degree of an Array
 */
public class Q0697 {

    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxDegree = 1;
        int range = Integer.MAX_VALUE;

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxDegree = Math.max(maxDegree, map.get(num));
        }

        if(maxDegree == 1) return 1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if(entry.getValue() == maxDegree) {
               int left = 0;
               int right = nums.length - 1;
               while(left < nums.length && nums[left] != entry.getKey()) left++;
               while(0 < right && nums[right] != entry.getKey()) right--;
               range = Math.min(range, right - left + 1);
           }
        }
        return range;
    }
}
