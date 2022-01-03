package D20220103;

import java.util.ArrayList;
import java.util.List;

/**
 * 1380. Lucky Numbers in a Matrix
 */
public class Q1380 {

    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        for (int[] array : matrix) {
            int min = array[0];
            int minIdx = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIdx = j;
                }
            }

            int max = min;
            for (int[] m : matrix) {
                if (m[minIdx] >= max) max = m[minIdx];
            }

            if (min == max) result.add(max);
        }

        return result;
    }
}
