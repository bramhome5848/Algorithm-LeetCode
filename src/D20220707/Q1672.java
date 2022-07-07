package D20220707;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1672. Richest Customer Wealth
 */
public class Q1672 {

    public int maximumWealth1(int[][] accounts) {

        int result = 0;

        for(int[] account : accounts) {
            int sum = 0;
            for (int value : account) {
                sum += value;
            }

            result = Math.max(sum, result);
        }

        return result;
    }
    public int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts)
                .map(s -> Arrays.stream(s).sum())
                .max(Comparator.comparingInt(r -> r)).orElse(0);
    }
}
