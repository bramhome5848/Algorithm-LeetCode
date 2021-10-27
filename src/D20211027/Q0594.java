package D20211027;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * 594. Longest Harmonious Subsequence
 */
public class Q0594 {

    public int findLHS1(int[] nums) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int result = 0;
        int befKey = Integer.MAX_VALUE;

        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(Integer key : map.keySet()) {
            if(befKey != Integer.MAX_VALUE && Math.abs(key - befKey) == 1) {
                result = Math.max(result, map.get(befKey) + map.get(key));
            }

            befKey = key;
        }
        return result;
    }

    public int findLHS2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(Integer key : map.keySet()) {
           if(map.containsKey(key+1)) result = Math.max(result, map.get(key) + map.get(key+1));
        }

        return result;
    }

    public int findLHS3(int[] nums) {

        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        int result = 0;

        for(Integer key : map.keySet()) {
            if(map.containsKey(key+1)) result = (int)(Math.max(result, map.get(key) + map.get(key+1)));
        }

        return result;
    }
}
