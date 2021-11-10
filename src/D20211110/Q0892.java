package D20211110;

/**
 * 892. Surface Area of 3D Shapes
 */
public class Q0892 {

    public int surfaceArea(int[][] grid) {

        int total = 0;

        for(int i=0 ; i<grid.length ; i++) {
            for(int j=0 ; j<grid.length ; j++) {
                if(grid[i][j] > 0) total += 6 * grid[i][j] - 2 * (grid[i][j]-1);
                if(i>0) total -= 2 * Math.min(grid[i-1][j], grid[i][j]);
                if(j>0) total -= 2 * Math.min(grid[i][j-1], grid[i][j]);
            }
        }

        return total;
    }
}
