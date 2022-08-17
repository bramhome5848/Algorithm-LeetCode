package D20220817;

/**
 * 2373. Largest Local Values in a Matrix
 */
public class Q2373 {

    public int[][] largestLocal(int[][] grid) {

        int n = grid.length;
        int[][] result = new int[n - 2][n - 2];

        for(int i=1 ; i<n-1 ; i++) {
            for(int j=1 ; j<n-1 ; j++) {
                result[i-1][j-1] = getMax(i, j, grid);
            }
        }

        return result;
    }

    private int getMax(int r, int c, int[][] grid) {

        int result = 0;
        for(int i=r-1 ; i<r+2 ; i++) {
            for(int j=c-1 ; j<c+2 ; j++) {
                result = Math.max(result, grid[i][j]);
            }
        }

        return result;
    }
}
