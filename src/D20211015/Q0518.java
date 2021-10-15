package D20211015;

/**
 * 518. Coin Change 2
 */
public class Q0518 {

    public int change(int amount, int[] coins) {

        int[] result = new int[amount+1];
        result[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j < amount + 1; j++) {
                result[j] = result[j] + result[j - coin];
            }
        }
        return result[amount];
    }
}
