package D20220119;

import java.util.Arrays;

/**
 * 1491. Average Salary Excluding the Minimum and Maximum Salary
 */
public class Q1491 {

    public double average(int[] salary) {

        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int s : salary) {
            min = Math.min(min, s);
            max = Math.max(max, s);
            sum += s;
        }

        return (sum - max - min) / (salary.length - 2);
    }
}
