package D20220808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 2160. Minimum Sum of Four Digit Number After Splitting Digits
 */
public class Q2160 {

    public int minimumSum(int num) {

        int[] data = new int[4];
        int idx = 0;

        while(num > 0) {
            data[idx++] = num % 10;
            num /= 10;
        }

        Arrays.sort(data);
        return (data[0] + data[1]) * 10 + data[2] + data[3];
    }
}
