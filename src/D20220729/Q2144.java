package D20220729;

import java.util.Arrays;

/**
 * 2144. Minimum Cost of Buying Candies With Discount
 */
public class Q2144 {

    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int result = 0;

        for(int i=0 ; i<cost.length ; i++) {
            if((cost.length-i) % 3 != 0) result += cost[i];
        }

        return result;
    }
}
