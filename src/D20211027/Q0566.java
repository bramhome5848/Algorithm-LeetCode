package D20211027;

/**
 * 566. Reshape the Matrix
 */
public class Q0566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(r*c != mat.length * mat[0].length) return mat;

        int[][] result = new int[r][c];
        int row = 0;
        int col = 0;

        for(int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                result[row][col++] = ints[j];

                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return result;
    }
}
