package D20210909;

/**
 * 419. Battleships in a Board
 */
public class Q0419 {

    public int countBattleships(char[][] board) {

        if(board == null || board.length == 0 || board[0].length == 0) return 0;

        int count = 0;
        for(int i=0 ; i<board.length ; i++) {
            for(int j=0 ; j<board[0].length ; j++) {
                if(board[i][j] == 'X') {
                    horCheck(i, j+1, board);
                    verCheck(i+1, j, board);
                    board[i][j] = 'O';
                    count++;
                }
            }
        }

        return count;
    }

    private void verCheck(int x, int y, char[][] board) {
        for(int i=x ; i<board.length ; i++) {
            if(board[i][y] != 'X') break;
            board[i][y] = 'O';
        }
    }

    private void horCheck(int x, int y, char[][] board) {
        for(int i=y ; i<board[0].length ; i++) {
            if(board[x][i] != 'X') break;
            board[x][i] = 'O';
        }
    }
}
