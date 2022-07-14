package D20220714;

/**
 * 1886. Determine Whether Matrix Can Be Obtained By Rotation
 */
public class Q1886 {

    public boolean findRotation(int[][] mat, int[][] target) {

        int num = 4;
        while(num-- > 0) {
            if(check(mat, target)) return true;
            mat = rotate(mat);
        }

        return false;
    }

    private int[][] rotate(int[][] mat) {
        int length = mat.length;
        int[][] result = new int[length][length];

        for(int i=0 ; i<length ; i++) {
            for(int j=0 ; j<length ; j++) {
                result[i][j] = mat[length-1-j][i];
            }
        }

        return result;
    }

    private boolean check(int[][] mat, int[][] target) {
        int length = mat.length;

        for(int i=0 ; i<length ; i++) {
            for(int j=0 ; j<length ; j++) {
                if(mat[i][j] != target[i][j]) return false;
            }
        }

        return true;
    }
}
