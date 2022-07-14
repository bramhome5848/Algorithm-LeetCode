package D20220714;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1893. Check if All the Integers in a Range Are Covered
 */
public class Q1893 {

    public boolean isCovered(int[][] ranges, int left, int right) {

        Set<Integer> set = IntStream.rangeClosed(left, right).boxed().collect(Collectors.toSet());

        for(int[] range : ranges) {
            set.removeAll(IntStream.rangeClosed(range[0], range[1]).boxed().collect(Collectors.toSet()));
        }

        return set.isEmpty();
    }
}
