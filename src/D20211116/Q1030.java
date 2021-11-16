package D20211116;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 1030. Matrix Cells in Distance Order
 */
public class Q1030 {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        List<int[]> result = new ArrayList<>();
        boolean[][] visited = new boolean[rows][cols];

        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{rCenter, cCenter});
        visited[rCenter][cCenter] = true;

        while(!que.isEmpty()) {
            int[] curr = que.poll();
            result.add(curr);

            for(int i=0 ; i<4 ; i++) {
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];

                if(nx<0 || nx>rows-1 || ny<0 || ny>cols-1) continue;
                if(visited[nx][ny]) continue;

                visited[nx][ny] = true;
                que.add(new int[]{nx, ny});
            }
        }

        return result.toArray(new int[][]{});
    }
}
