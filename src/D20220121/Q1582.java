package D20220121;

import java.util.*;

/**
 * 1582. Special Positions in a Binary Matrix
 */
public class Q1582 {

    public static int numSpecial1(int[][] mat) {

        int[] rowSum = new int[mat.length];
        int[] colSum = new int[mat[0].length];
        int result = 0;

        for(int i=0 ; i<mat.length/2 ; i++) {
            for(int j=0 ; j<mat[0].length/2 ; j++) {
                if(mat[i][j] == 1) {
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }

        for(int i=0 ; i<rowSum.length ; i++) {
            if(rowSum[i] == 1) {
                for(int j=0 ; j<colSum.length ; j++) {
                    if(colSum[j] == 1 && mat[i][j] == 1) result++;
                }
            }
        }

        return result;
    }
}
