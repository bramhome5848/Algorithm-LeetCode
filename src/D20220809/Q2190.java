package D20220809;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 2190. Most Frequent Number Following Key In an Array
 */
public class Q2190 {

    public int mostFrequent(int[] nums, int key) {

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i-1] == key) {
                freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            }
        }

        return freq.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey).orElse(0);
    }
}
