package D20210630;

/**
 * 70. Climbing Stairs
 */
public class Q0070 {

    public int climbStairs(int n) {

        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;

        for(int i=2 ; i<n+1 ; i++) {
            result[i] = result[i-2] + result[i-1];
        }

        return result[n];
    }
}
