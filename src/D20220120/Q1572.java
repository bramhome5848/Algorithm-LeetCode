package D20220120;

/**
 * 1572. Matrix Diagonal Sum
 */
public class Q1572 {

    public int diagonalSum(int[][] mat) {

        int result = 0;

        for(int i=0 ; i<mat.length ; i++) {
            result += mat[i][i] + mat[i][mat.length-1-i];
        }

        return mat.length % 2 == 1 ? result - mat[mat.length/2][mat.length-2] : result;
    }
}
