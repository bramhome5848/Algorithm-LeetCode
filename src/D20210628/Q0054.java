package D20210628;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. Spiral Matrix
 */
public class Q0054 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int n = 0;
        int m = 0;
        int r = matrix.length;
        int c = matrix[0].length;

        while (n < r && m < c){

            //right
            for (int i=m ; i<c ; i++){
                result.add(matrix[n][i]);
            }
            n++;

            //down
            for (int i=n ; i<r ; i++){
                result.add(matrix[i][c-1]);
            }
            c--;

            //left
            if (n < r) {
                for (int i=c-1; i>=m ; i--) {
                    result.add(matrix[r-1][i]);
                }
            }
            r--;

            //up
            if (m < c) {
                for (int i=r-1 ; i>=n ; i--) {
                    result.add(matrix[i][m]);
                }
            }
            m++;
        }

        return result;
    }
}
