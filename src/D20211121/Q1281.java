package D20211121;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 */
public class Q1281 {

    public int subtractProductAndSum(int n) {

        int sum = 0;
        int prod = 1;

        while(n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }

        return prod - sum;
    }
}
