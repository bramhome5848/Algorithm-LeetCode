package D20220815;

/**
 * 2319. Check if Matrix Is X-Matrix
 */
public class Q2319 {

    public boolean checkXMatrix(int[][] grid) {

        int length = grid.length;

        for(int i=0 ; i<length ; i++) {
            for(int j=0 ; j<length ; j++) {
                if(grid[i][i] == 0 || grid[i][length-1-i] == 0) return false;
                else if(i != j && j != length-1-i && grid[i][j] != 0) return false;
            }
        }

        return true;
    }
}
