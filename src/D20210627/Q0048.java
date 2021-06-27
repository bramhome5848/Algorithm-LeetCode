package D20210627;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 48. Rotate Image
 */
public class Q0048 {

    public void rotate(int[][] matrix) {

        int n = matrix.length;
        Queue<Integer> que = new LinkedList<>();

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                que.add(matrix[i][j]);
            }
        }

        for(int j=n-1 ; j>-1 ; j--) {
            for(int i=0 ; i<n ; i++) {
                matrix[i][j] = que.poll();
            }
        }
    }
}
