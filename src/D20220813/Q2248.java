package D20220813;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2248. Intersection of Multiple Arrays
 */
public class Q2248 {

    public List<Integer> intersection(int[][] nums) {

         return Arrays.stream(nums)
                 .flatMapToInt(Arrays::stream)
                 .boxed().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                 .entrySet().stream()
                 .filter(e -> e.getValue() == nums.length)
                 .map(Map.Entry::getKey).sorted()
                 .collect(Collectors.toList());
    }
}
