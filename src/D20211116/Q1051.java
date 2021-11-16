package D20211116;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1051. Height Checker
 */
public class Q1051 {

    public int heightChecker1(int[] heights) {

        int[] result = Arrays.copyOf(heights, heights.length);
        int count = 0;

        Arrays.sort(result);

        for(int i=0 ; i<heights.length ; i++) {
            if(heights[i] != result[i]) count++;
        }

        return count;
    }
}
