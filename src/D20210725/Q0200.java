package D20210725;

import java.util.LinkedList;
import java.util.Queue;

public class Q0200 {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                if(grid[i][j] == '1') {
                    bfsSearch(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfsSearch(int x, int y, char[][] grid) {

        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x, y});
        grid[x][y] = '2';   //visited

        while(!que.isEmpty()) {
            int[] point = que.poll();

            for(int i=0 ; i<4 ; i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];

                if(nx<0 || grid.length-1<nx || ny<0 || grid[0].length-1<ny) continue;
                if(grid[nx][ny] != '1') continue;

                que.add(new int[]{nx, ny});
                grid[nx][ny] = '2';
            }
        }
    }
}
