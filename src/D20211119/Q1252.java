package D20211119;

/**
 * 1252. Cells with Odd Values in a Matrix
 */
public class Q1252 {

    public int oddCells(int m, int n, int[][] indices) {

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        int result = 0;

        for (int[] e : indices) {
            rows[e[0]] = !rows[e[0]];
            cols[e[1]] = !cols[e[1]];
        }

        for(boolean row : rows) {
            for(boolean col : cols) {
               if(row ^ col) result++;
            }
        }

        return result;
    }
}
