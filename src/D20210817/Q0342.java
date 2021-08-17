package D20210817;

/**
 * 342. Power of Four
 */
public class Q0342 {

    public boolean isPowerOfFour1(int n) {

        if(n < 1) return false;
        if(n == 1) return true;
        if(n % 4 != 0) return false;

        return isPowerOfFour1(n / 4);
    }

    // solve it without loops/recursion
    // 1  -> 1
    // 4  -> 100
    // 16 -> 10000
    // 64 -> 1000000
    public boolean isPowerOfFour2(int n) {
        if(n < 1) return false;
        if(n == 1) return true;

        String binary = Integer.toBinaryString(n);
        if(binary.length() % 2 != 1) return false;
        if(binary.charAt(0) != '1') return false;

        return binary.lastIndexOf('1') == 0;
    }
}
