package D20210629;

import java.util.Arrays;

/**
 * 62. Unique Paths
 */
public class Q0062 {

    public int uniquePaths(int m, int n) {

        if(m<2 && n<2) return 1;

        int[][] result = new int[m][n];
        Arrays.fill(result[0], 1);

        for(int i=1 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(j==0) result[i][j] = 1;
                else result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }

        return result[m-1][n-1];
    }
}
