package D20210626;

/**
 *
 */
public class Q0036 {
    /**
     * 1 ~ 9 까지 SUDOKU, bit 연산
     */
    public boolean isValidSudoku(char[][] board) {

        int[] row = new int[9];
        int[] col = new int[9];
        int[][] mat = new int[3][3];

        for(int i=0 ; i<9 ; i++) {
            for(int j=0  ; j<9 ; j++) {
                if(board[i][j] != '.'){
                    int value = board[i][j] -'0';   //sudoku value
                    int valueToBit = 1 << value;
                    // row, col 해당 값에 해당 하는 bit 가 없고
                    // 3 * 3 부분 sudoku 에서도 값이 존재 하지 않는 경우
                    if ((row[i] & valueToBit) == 0 && (col[j] & valueToBit) == 0 && (mat[i / 3][j / 3] & valueToBit) == 0) {
                        row[i] ^= valueToBit;
                        col[j] ^= valueToBit;
                        mat[i/3][j/3] ^= valueToBit;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
