package D20210625;

/**
 * 29. Divide Two Integers
 */
public class Q0029 {

    public int divide(int dividend, int divisor) {
        if ((int) dividend / divisor == Integer.MIN_VALUE && divisor < 0) return Integer.MAX_VALUE;
        return (int)dividend / divisor;
    }
}
