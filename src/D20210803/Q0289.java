package D20210803;

/**
 * 289. Game of Life
 */
public class Q0289 {

    public void gameOfLife(int[][] board) {

        int[] dx = {0, 0, -1, -1, -1, 1, 1, 1};
        int[] dy = {-1, 1, -1, 0 , 1 , -1, 0 , 1};

        int n = board.length;
        int m = board[0].length;

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                int cnt = 0;
                for(int k=0 ; k<8 ; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx<0 || n-1<nx || ny<0 || m-1<ny) continue;
                    if(board[nx][ny] == 1 || board[nx][ny] == -100) cnt++;
                }

                if(board[i][j] == 0) {
                    if(cnt == 3) board[i][j] = 100;
                } else {
                    if(cnt < 2 || cnt > 3) board[i][j] = -100;
                }
            }
        }

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                if(board[i][j] == 100) board[i][j] = 1;
                else if(board[i][j] == -100) board[i][j] = 0;
            }
        }
    }
}
