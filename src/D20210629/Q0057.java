package D20210629;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 57. Insert Interval
 */
public class Q0057 {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals == null || intervals.length ==0) return new int[][]{newInterval};
        if(newInterval.length == 0) return intervals;

        List<int[]> result = new ArrayList<>();
        int index = 0;

        while(index<intervals.length && intervals[index][1] < newInterval[0]) {
            result.add(intervals[index++]);
        }

        while(index<intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index++;
        }
        result.add(newInterval);

        while(index<intervals.length) {
            result.add(intervals[index++]);
        }

        return result.toArray(new int[result.size()][2]);
    }
}
