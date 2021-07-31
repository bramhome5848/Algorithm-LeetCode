package D20210731;

/**
 * 240. Search a 2D Matrix II
 */
public class Q0240 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) row++;
            else col--;
        }
        return false;
    }
}
