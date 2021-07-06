package D20210706;

/**
 * 121. Best Time to Buy and Sell Stock
 */
public class Q0121 {

    public int maxProfit(int[] prices) {
        int result = 0;
        int start = Integer.MAX_VALUE;

        for(int i=0 ; i<prices.length ; i++) {
            if(start > prices[i]) start = prices[i];
            result = Math.max(result, prices[i] - start);
        }

        return result;
    }
}
