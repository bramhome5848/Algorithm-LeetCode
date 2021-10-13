package D20211013;

/**
 * 498. Diagonal Traverse
 */
public class Q0498 {

    public int[] findDiagonalOrder(int[][] mat) {

        if(mat.length == 0 || mat[0].length == 0) return new int[]{};

        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        int r = 0;
        int c = 0;

        for(int i=0 ; i<result.length ; i++) {
            result[i] = mat[r][c];
            if((r+c) % 2 == 0) {    //up
                if(c == cols-1) r++;
                else if(r == 0) c++;
                else {
                    r--;
                    c++;
                }
            } else {    //down
                if(r == rows-1) c++;
                else if(c == 0) r++;
                else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
