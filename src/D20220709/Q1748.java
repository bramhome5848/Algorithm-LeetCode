package D20220709;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1748. Sum of Unique Elements
 */
public class Q1748 {

    public int sumOfUnique(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .filter(s -> s.getValue() == 1)
                .map(Map.Entry::getKey)
                .mapToInt(s -> s)
                .sum();
    }
}
