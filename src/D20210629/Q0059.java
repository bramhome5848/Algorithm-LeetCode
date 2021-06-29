package D20210629;

/**
 * 59. Spiral Matrix II
 */
public class Q0059 {
    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];
        int x = 0;
        int y = 0;
        int r = n;
        int c = n;
        int value = 1;

        while (x < r && y < c){

            //right
            for (int i=y ; i<c ; i++){
                result[x][i] = value++;
            }
            x++;

            //down
            for (int i=x ; i<r ; i++){
                result[i][c-1] = value++;
            }
            c--;

            //left
            if (x < r) {
                for (int i=c-1; i>=y ; i--) {
                    result[r-1][i] = value++;
                }
            }
            r--;

            //up
            if (y < c) {
                for (int i=r-1 ; i>=x ; i--) {
                    result[i][y] = value++;
                }
            }
            y++;
        }

        return result;
    }
}
