package D20210728;

/**
 * 221. Maximal Square
 */
public class Q0221 {

    public int maximalSquare(char[][] matrix) {

        int max = Integer.MIN_VALUE;
        int[][] result = new int[matrix.length+1][matrix[0].length+1];

        for(int i=1 ; i<matrix.length+1 ; i++) {
            for(int j=1 ; j<matrix[0].length+1 ; j++) {
                if(matrix[i-1][j-1] == '1') {
                    result[i][j] = Math.min(result[i-1][j-1], Math.min(result[i-1][j], result[i][j-1])) + 1;
                    max = Math.max(max, result[i][j]);
                }
            }
        }
        return max * max;
    }
}
