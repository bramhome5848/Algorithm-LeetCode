package D20210629;

/**
 * 64. Minimum Path Sum
 */
public class Q0064 {

    public int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int[][] result = new int[n][m];
        result[0][0] = grid[0][0];

        for(int i=1 ; i<n ; i++) {
            result[i][0] =  result[i-1][0] + grid[i][0];
        }

        for(int i=1 ; i<m ; i++) {
            result[0][i] =  result[0][i-1] + grid[0][i];
        }

        for(int i=1 ; i<n ; i++) {
            for(int j=1 ; j<m; j++) {
                result[i][j] = Math.min(result[i-1][j], result[i][j-1]) + grid[i][j];
            }
        }

        return result[n-1][m-1];
    }
}
