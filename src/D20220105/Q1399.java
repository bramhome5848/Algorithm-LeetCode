package D20220105;

import java.util.*;

/**
 * 1399. Count Largest Group
 */
public class Q1399 {

    public int countLargestGroup(int n) {

        Map<Integer, Integer> data = new HashMap<>();
        int count = 0;
        int max = 0;

        for(int i=1; i<n+1 ; i++) {
            int value = i;
            int sum = 0;
            while(value > 0) {
                sum += value % 10;
                value /= 10;
            }
            data.put(sum, data.getOrDefault(sum, 0) + 1);
            max = Math.max(max, data.get(sum));
        }

        for(int value : data.values()) {
            if(max == value) count++;
        }

        return count;
    }
}
