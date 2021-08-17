package D20210817;

/**
 * 343. Integer Break
 */
public class Q0343 {

    // sum of k positive integers, k>=2
    // maximize the product of those integers
    public int integerBreak(int n) {

        if(n==2) return 1;
        if(n==3) return 2;

        int remain = n % 3;
        if(remain == 0) return cal(3, n/3);
        else if(remain == 1) return 4 * cal(3,(n-4)/3);
        else return 2 * cal (3, n/3);
    }

    private int cal(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
