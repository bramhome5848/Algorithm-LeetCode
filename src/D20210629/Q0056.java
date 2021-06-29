package D20210629;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 56. Merge Intervals
 */
public class Q0056 {

    public int[][] merge(int[][] intervals) {

        if(intervals.length < 2) return intervals;

        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);

        List<int[]> result = new ArrayList<>();
        int[] prev = intervals[0];

        for(int i=1 ; i<intervals.length ; i++) {
            if(intervals[i][0] <= prev[1]) {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else {
                result.add(prev);
                prev = intervals[i];
            }
        }

        result.add(prev);
        return result.toArray(new int[result.size()][2]);
    }
}
