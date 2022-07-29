package D20220729;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 2133. Check if Every Row and Column Contains All Numbers
 */
public class Q2133 {

    public boolean checkValid(int[][] matrix) {

        int[] rowSum = new int[matrix.length];
        int[] colSum = new int[matrix.length];
        int total = matrix.length * (matrix.length + 1) / 2;

        for(int i=0 ; i<matrix.length ; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0 ; j<matrix.length ; j++) {
                if(set.contains(matrix[i][j])) return false;

                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
                set.add(matrix[i][j]);
            }
        }

        for(int i=0 ; i<matrix.length ; i++){
            if(rowSum[i] != total || colSum[i] != total) return false;
        }

        return true;
    }
}
