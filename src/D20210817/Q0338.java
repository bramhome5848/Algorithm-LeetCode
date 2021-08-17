package D20210817;

/**
 * 338. Counting Bits
 */
public class Q0338 {

    public int[] countBits(int n) {

        int[] result = new int[n+1];

        for(int i=1 ; i<n+1 ; i++) {
            result[i] = result[i/2] + i%2;
        }
        return result;
    }
}
