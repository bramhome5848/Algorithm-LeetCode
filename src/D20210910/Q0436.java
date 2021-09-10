package D20210910;

import java.util.*;

/**
 * 436. Find Right Interval
 */
public class Q0436 {

    //The start point of each interval is unique
    public int[] findRightInterval(int[][] intervals) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] result = new int[intervals.length];

        for(int i = 0; i < intervals.length; i++) map.put(intervals[i][0], i);

        for(int i = 0; i < intervals.length; i++){
            //키 값보다 크거나 같은 값 중 가장 작은 키의 키값을 반환
            Integer key = map.ceilingKey(intervals[i][1]);
            result[i] = (key == null) ? -1 : map.get(key);
        }

        return result;
    }
}
