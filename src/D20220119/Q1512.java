package D20220119;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 1512. Number of Good Pairs
 */
public class Q1512 {

    public int numIdenticalPairs1(int[] nums) {

        Map<Integer, Integer> data = new HashMap<>();
        int result = 0;

        for(int num : nums) {
           data.put(num, data.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : data.entrySet()) {
           if(e.getValue() > 1) {
               result += e.getValue() * (e.getValue() - 1) / 2;
           }
        }

        return result;
    }

    public int numIdenticalPairs2(int[] nums) {

        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .values().stream().filter(s -> s > 1)
                .mapToInt(Long::intValue)
                .reduce(0, (s1, s2) -> s1 + (s2 * (s2-1)) / 2);
    }
}
