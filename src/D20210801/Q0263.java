package D20210801;

/**
 * 263. Ugly Number
 */
public class Q0263 {

    public boolean isUgly(int n) {
        if(n < 1) return false;
        while(n % 2 == 0) n = n / 2;
        while(n % 3 == 0) n = n / 3;
        while(n % 5 == 0) n = n / 5;
        return n == 1;
    }
}
