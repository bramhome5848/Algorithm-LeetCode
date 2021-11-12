package D20211112;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 961. N-Repeated Element in Size 2N Array
 */
public class Q0961 {

    public int repeatedNTimes1(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(!set.add(num)) return num;
        }

        return -1;
    }
    public int repeatedNTimes2(int[] nums) {

        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() == nums.length / 2)
                .mapToInt(Map.Entry::getKey).sum();
    }
}
