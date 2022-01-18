package D20220118;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 1475. Final Prices With a Special Discount in a Shop
 */
public class Q1475 {

    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0 ; i<prices.length ; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                prices[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }

        return prices;
    }
}
