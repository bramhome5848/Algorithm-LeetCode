package D20210811;

import java.util.Arrays;

/**
 * 322. Coin Change
 */
public class Q0322 {

    public int coinChange(int[] coins, int amount) {

        int[] result = new int[amount+1];
        Arrays.fill(result, amount+1);
        result[0] = 0;

        for(int i=1 ; i<result.length ; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    result[i] = Math.min(result[i], result[i - coin] + 1);
                }
            }
        }

        //return dp[amount]==amount+1 ? -1 : dp[amount];
        return result[amount] == amount+1 ? -1 : result[amount];
    }
}
