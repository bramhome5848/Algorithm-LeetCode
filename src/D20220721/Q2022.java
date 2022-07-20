package D20220721;

/**
 * 2022. Convert 1D Array Into 2D Array
 */
public class Q2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m * n) return new int[0][];

        int[][] result = new int[m][n];
        for(int i=0 ; i<original.length ; i++) result[i/n][i%n] = original[i];

        return result;
    }
}
