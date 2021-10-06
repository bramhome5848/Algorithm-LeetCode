package D20211006;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 452. Minimum Number of Arrows to Burst Balloons
 */
public class Q0452 {

    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, Comparator.comparingInt(p -> p[1]));

        int end = points[0][1];
        int count = 1;

        for (int[] point : points) {
            if (end < point[0]) {
                count++;
                end = point[1];
            }
        }

        return count;
    }
}
