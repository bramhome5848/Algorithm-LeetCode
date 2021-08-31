package D20210831;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 378. Kth Smallest Element in a Sorted Matrix
 */
public class Q0378 {

    public int kthSmallest(int[][] matrix, int k) {

        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .skip(k-1)
                .findFirst()
                .orElse(0);
    }
}
