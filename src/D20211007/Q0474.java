package D20211007;

/**
 * 474. Ones and Zeroes
 */
public class Q0474 {

    public int findMaxForm(String[] strs, int m, int n) {

        int[][] result = new int[m+1][n+1];

        for(String str : strs) {
            int cntZero = 0;
            int cntOne = 0;

            for(char c : str.toCharArray()) {
               if(c == '0') cntZero++;
               else cntOne++;
            }

            for(int i=m ; i>cntZero-1 ; i--) {
                for(int j=n ; j>cntOne-1 ; j--) {
                    result[i][j] = Math.max(result[i][j], result[i-cntZero][j-cntOne] + 1);
                }
            }
        }
        return result[m][n];
    }
}
