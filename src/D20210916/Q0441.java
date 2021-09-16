package D20210916;

/**
 * 441. Arranging Coins
 */
public class Q0441 {

    public int arrangeCoins(int n) {

        int count = 0;
        int step = 1;

        while(n > 0){
            if(n-step >= 0){
                count++;
                n -= step;
                step++;
            } else break;
        }

        return count;
    }
}
