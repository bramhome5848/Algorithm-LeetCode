package D20211012;

import java.util.Arrays;

/**
 * 494. Target Sum
 */
public class Q0494 {

    public int findTargetSumWays(int[] nums, int target) {

        int sum = Arrays.stream(nums).sum();
        if((sum+target) % 2 != 0) return 0;

        int n = nums.length;
        int m = (sum+target) / 2;
        int[][] result = new int[n+1][m+1];

        for(int i=0 ; i<n+1 ; i++) result[i][0] = 1;

        for(int i=1 ; i<n+1 ; i++) {
            for(int j=0 ; j<m+1 ; j++) {
                if(nums[i-1]<j+1) result[i][j] = result[i-1][j-nums[i-1]] + result[i-1][j];
                else result[i][j] = result[i-1][j];
            }
        }

        return result[n][m];
    }
}
