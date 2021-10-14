package D20211014;

/**
 * 509. Fibonacci Number
 */
public class Q0509 {

    public int fib(int n) {

        if(n<2) return n;

        int first = 0;
        int second = 1;
        int sum = 0;

        for(int i = 2; i <= n; i++){
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }
}
