package D20210730;

/**
 * 231. Power of Two
 */
public class Q0231 {

    /**
     * 2 -> 10, 4-> 100
     * 1 -> 01, 3-> 011
     */
    public boolean isPowerOfTwo(int n) {
        if(n < 1) return false;
        return (n & (n-1)) == 0;
    }
}
