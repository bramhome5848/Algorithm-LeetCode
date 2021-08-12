package D20210812;

/**
 * 326. Power of Three
 */
public class Q0326 {

    public boolean isPowerOfThree1(int n) {

        if(n == 1) return true;
        if(n == 0) return false;

        while(n > 1) {
            if(n%3 != 0) return false;
            n /= 3;
        }

        return n == 1;
    }

    public boolean isPowerOfThree2(int n) {

        if(n == 0) return false;
        if(n == 1) return true;

        if(n % 3 != 0) return false;

        return isPowerOfThree2(n/3);
    }
}
