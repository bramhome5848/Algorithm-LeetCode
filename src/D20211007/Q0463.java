package D20211007;

/**
 * 463. Island Perimeter
 */
public class Q0463 {

    public int islandPerimeter(int[][] grid) {

        int result = 0;
        int x = grid.length;
        int y = grid[0].length;

        if(x == 1 && y == 1 && grid[0][0] == 1) return 4;

        for(int i=0 ; i<x ; i++) {
            for(int j=0 ; j<y ; j++) {
                if(grid[i][j] == 1) result += 4;
                if(i>0 && grid[i-1][j] == 1 && grid[i][j] == 1) result -= 2;
                if(j>0 && grid[i][j-1] == 1 && grid[i][j] == 1) result -= 2;
            }
        }

        return result;
    }
}
