package D20211006;

import java.util.Arrays;

/**
 * 453. Minimum Moves to Equal Array Elements
 */
public class Q0453 {

    public int minMoves(int[] nums) {

        int min = Integer.MAX_VALUE;
        int result = 0;

        for(int num : nums) {
            min = Math.min(min, num);
        }

        for(int num : nums) {
            result += num - min;
        }

        return result;
    }
}
