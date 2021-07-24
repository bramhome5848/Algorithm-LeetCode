package D20210724;

/**
 * 191. Number of 1 Bits
 */
public class Q0191 {

    public int hammingWeight(int n) {
        return Math.toIntExact(Integer.toBinaryString(n)
                .chars().filter(s -> s > 48).count());
    }
}
