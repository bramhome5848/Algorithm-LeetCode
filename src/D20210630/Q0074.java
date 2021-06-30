package D20210630;

/**
 * 74. Search a 2D Matrix
 */
public class Q0074 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int index = 0;
        for(int i=0 ; i< matrix.length ; i++) {
            if(matrix[i][0] <= target) index = i;
            else break;
        }

        for(int j=0 ; j<matrix[index].length ; j++) {
            if(matrix[index][j] == target) return true;
        }
        return false;
    }
}
