package D20210706;

import com.sun.nio.sctp.SctpSocketOption;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 130. Surrounded Regions
 */
public class Q0130 {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    public void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                if(board[i][j] =='O' && (i==0 || i==n-1 || j==0 || j==m-1)) {
                    dfsSearch(i, j, board);
                }
            }
        }

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                if(board[i][j] == '@') board[i][j] ='O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }

    public void dfsSearch(int x, int y, char[][] board) {
        int n = board.length;
        int m = board[0].length;
        board[x][y] = '@';

        for(int i=0 ; i<4 ; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx<0 || n-1<nx || ny<0 || m-1<ny) continue;
            if(board[nx][ny] !='O') continue;

            dfsSearch(nx, ny, board);
        }
    }
}
