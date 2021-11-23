package D20211123;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1356. Sort Integers by The Number of 1 Bits
 */
public class Q1356 {

    public int[] sortByBits(int[] arr) {

        return Arrays.stream(arr).boxed()
                .sorted((s1, s2) -> Integer.bitCount(s1) == Integer.bitCount(s2) ?
                        s1 - s2 : Integer.bitCount(s1) - Integer.bitCount(s2)).mapToInt(s -> s)
                .toArray();
    }
}
