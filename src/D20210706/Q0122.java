package D20210706;

/**
 * 122. Best Time to Buy and Sell Stock II
 */
public class Q0122 {

    public int maxProfit(int[] prices) {

        int result = 0;
        if(prices.length == 1) return result;

        for(int i=0 ; i<prices.length-1 ; i++) {
            if(prices[i] < prices[i+1]) {
                result += prices[i+1] - prices[i];
            }
        }
        return result;
    }
}
