package D20220715;

/**
 * 1925. Count Square Sum Triples
 */
public class Q1925 {

    public int countTriples(int n) {

        int result = 0;

        for(int i=1 ; i<n+1 ; i++) {
            for(int j=i+1 ; j<n+1 ; j++) {
                double sqrt = Math.sqrt(i * i + j * j);
                if (sqrt % 1 == 0 && sqrt <= n) result++;
            }
        }

        return result * 2;
    }
}
