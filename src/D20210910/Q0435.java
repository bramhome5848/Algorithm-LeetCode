package D20210910;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. Non-overlapping Intervals
 */
public class Q0435 {

    public int eraseOverlapIntervals(int[][] intervals) {

        int count = 0;
        int prevEnd = Integer.MIN_VALUE;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        for(int[] interval : intervals) {
           if(interval[0] < prevEnd) {
               count++;
               prevEnd = Math.min(prevEnd, interval[1]);
           } else {
               prevEnd = interval[1];
           }
        }
        return count;
    }
}
