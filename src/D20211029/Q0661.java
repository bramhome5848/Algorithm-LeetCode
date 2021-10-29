package D20211029;

/**
 * 661. Image Smoother
 */
public class Q0661 {

    public int[][] imageSmoother(int[][] img) {

        int n = img.length;
        int m = img[0].length;
        int[][] result = new int[n][m];
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                int sum = 0;
                int count = 0;
                for(int[] direction : directions) {
                    if (i + direction[0] > -1 && i + direction[0] < n &&
                            j + direction[1] > -1 && j + direction[1] < m) {
                        sum += img[i + direction[0]][j + direction[1]];
                        count++;
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}
