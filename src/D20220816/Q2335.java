package D20220816;

import java.util.Arrays;

/**
 * 2335. Minimum Amount of Time to Fill Cups
 */
public class Q2335 {

    public int fillCups(int[] amount) {
        return Math.max((Arrays.stream(amount).sum() + 1) / 2
                , Arrays.stream(amount).max().orElse(0));
    }
}
