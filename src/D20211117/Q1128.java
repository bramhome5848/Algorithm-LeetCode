package D20211117;

import java.util.HashMap;
import java.util.Map;

/**
 * 1128. Number of Equivalent Domino Pairs
 */
public class Q1128 {

    public static int numEquivDominoPairs(int[][] dominoes) {

        int[] data = new int[100];
        int result = 0;

        for(int[] d : dominoes) {
            int min = Math.min(d[0], d[1]);
            int max = Math.max(d[0], d[1]);
            result += data[max * 10 + min]++;
        }

        return result;
    }
}
