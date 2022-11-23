package M20221123;

/**
 * 7. Reverse Integer
 */
public class Q0007 {
    //Integer.MAX_VALUE ->  2147483647
    //Integer.MAX_VALUE -> -2147483648
    public int reverse(int x) {

        int result = 0;

        while(x != 0) {
            if(result > 214748364 || result < -214748364) return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }

        return result;
    }
}
