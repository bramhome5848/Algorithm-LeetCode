package D20210628;

/**
 * 50. Pow(x, n)
 */
public class Q0050 {

    //x^n = (x^(n/2)) * (x^(n/2))
    public double myPow(double x, int n) {
        if(x == 0) return 0;

        if(n >= 0) return cal(x, n);
        else return cal(1/x, n);
    }

    public double cal(double x, int n) {
        if(n == 0) return 1;

        double value = cal(x, n/2);

        if(n%2 == 0) {
            return value * value;
        } else {
            return x * value * value;
        }
    }
}
