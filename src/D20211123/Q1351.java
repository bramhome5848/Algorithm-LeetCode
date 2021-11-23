package D20211123;

/**
 * 1351. Count Negative Numbers in a Sorted Matrix
 */
public class Q1351 {

    public int countNegatives(int[][] grid) {

        int count = 0;

        for(int[] row : grid) {
            for(int j = grid[0].length - 1; j > -1; j--) {
                if (row[j] >= 0) break;
                else count++;
            }
        }

        return count;
    }
}
