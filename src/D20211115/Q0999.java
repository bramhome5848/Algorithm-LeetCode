package D20211115;

/**
 * 999. Available Captures for Rook
 */
public class Q0999 {

    public int numRookCaptures(char[][] board) {

        int px = 0;
        int py = 0;
        int count = 0;

        outer:
        for(int i=0 ; i<board.length ; i++) {
            for(int j=0 ; j<board[0].length ; j++) {
                if(board[i][j] == 'R') {
                    px = i;
                    py = j;
                    break outer;
                }
            }
        }

        //up
        for(int x=px, y=py ; x>-1 ; x--) {
            if(board[x][y] == 'p') {
                count++;
                break;
            }

            if(board[x][y] == 'B') break;
        }

        //down
        for(int x=px, y=py ; x<board.length ; x++) {
            if(board[x][y] == 'p') {
                count++;
                break;
            }

            if(board[x][y] == 'B') break;
        }

        //right
        for(int x=px, y=py ; y<board[0].length ; y++) {
            if(board[x][y] == 'p') {
                count++;
                break;
            }

            if(board[x][y] == 'B') break;
        }

        //left
        for(int x=px, y=py ; y>-1 ; y--) {
            if(board[x][y] == 'p') {
                count++;
                break;
            }

            if(board[x][y] == 'B') break;
        }

        return count;
    }
}
