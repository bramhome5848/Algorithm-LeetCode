package D20211103;

/**
 * 766. Toeplitz Matrix
 */
public class Q0766 {

    public boolean isToeplitzMatrix(int[][] matrix) {

        for(int i=matrix.length-1 ; i>0 ; i--) {
            int j = matrix[0].length - 2;
            while (j >= 0) {
                if(matrix[i][j+1] != matrix[i-1][j]) return false;
                j--;
            }
        }
        return true;
    }
}
