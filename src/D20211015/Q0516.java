package D20211015;

/**
 * 516. Longest Palindromic Subsequence
 */
public class Q0516 {

    public static int longestPalindromeSubseq(String s) {

        int[][] result =new int[s.length()+1][s.length()+1];

        //reverse string
        String str = new StringBuilder(s).reverse().toString();

        for(int i=1 ; i<s.length()+1 ; i++) {
            for(int j=1 ; j<s.length()+1 ; j++){
                if(s.charAt(i-1) == str.charAt(j-1)) result[i][j] = result[i-1][j-1] + 1;
                else result[i][j] = Math.max(result[i-1][j], result[i][j-1]);
            }
        }
        return result[s.length()][s.length()];
    }
}
