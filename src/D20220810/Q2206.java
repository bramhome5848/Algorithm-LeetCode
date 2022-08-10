package D20220810;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2206. Divide Array Into Equal Pairs
 */
public class Q2206 {

    public boolean divideArray(int[] nums) {

        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .values().stream().noneMatch(s -> s % 2 != 0);
    }
}
