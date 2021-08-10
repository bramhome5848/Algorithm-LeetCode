package D20210810;

/**
 * 313. Super Ugly Number
 */
public class Q0313 {

    public int nthSuperUglyNumber(int n, int[] primes) {

        int[] count  = new int[primes.length];
        int[] result = new int[n];
        result[0] = 1;

        for(int i=1 ; i<n ; i++) {
            result[i] = Integer.MAX_VALUE;

            for(int j=0 ; j<primes.length ; j++) {
                result[i] = Math.min(result[i], primes[j] * result[count[j]]);
            }

            for (int j = 0; j < primes.length; j++) {
                if(result[i] % primes[j] == 0) count[j]++;
            }
        }

        return result[n-1];
    }
}
