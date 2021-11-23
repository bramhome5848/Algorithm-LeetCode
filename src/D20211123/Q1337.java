package D20211123;

import java.util.*;

/**
 * 1337. The K Weakest Rows in a Matrix
 */
public class Q1337 {

    public int[] kWeakestRows(int[][] mat, int k) {

        int[][] data = new int[mat.length][2];

        for(int i=0 ; i<mat.length ; i++) {
            data[i][0] = Arrays.stream(mat[i]).sum();
            data[i][1] = i;
        }

        return Arrays.stream(data)
                .sorted((d1, d2) -> d1[0] == d2[0] ? d1[1] - d2[1] : d1[0] - d2[0])
                .limit(k)
                .mapToInt(s -> s[1]).toArray();
    }
}
