package D20211028;

/**
 * 598. Range Addition II
 */
public class Q0598 {

    public int maxCount(int m, int n, int[][] ops) {

        int x = m;
        int y = n;

        for(int[] op : ops) {
           x = Math.min(x, op[0]);
           y = Math.min(y, op[1]);
        }

        return x * y;
    }
}
