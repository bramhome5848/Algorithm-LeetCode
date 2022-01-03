package D20220103;

/**
 * 1374. Generate a String With Characters That Have Odd Counts
 */
public class Q1374 {

    public String generateTheString(int n) {
        return n % 2 == 0 ? "a".repeat(n-1) + "b" : "a".repeat(n);
    }
}
