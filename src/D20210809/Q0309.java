package D20210809;

/**
 * 309. Best Time to Buy and Sell Stock with Cooldown
 */
public class Q0309 {

    //3 state dp result
    public int maxProfit(int[] prices) {

        // 0 -> buy, 1-> sell, 2 -> cool
        int[][] result = new int[prices.length][3];
        result[0][0] = -prices[0];

        for(int i=1 ; i<prices.length ; i++) {
            result[i][0] = Math.max(result[i-1][0], result[i-1][2] - prices[i]);
            result[i][1] = Math.max(result[i-1][1], result[i-1][0] + prices[i]);
            result[i][2] = Math.max(result[i-1][1], result[i-1][2]);
        }
        return result[prices.length-1][1];
    }
}
