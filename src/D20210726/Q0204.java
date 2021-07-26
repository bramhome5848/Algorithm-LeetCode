package D20210726;

import java.util.Arrays;

/**
 * 204. Count Primes
 */
public class Q0204 {

    public int countPrimes(int n) {

        if(n <= 2) return 0;

        int result = 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);

        for(int i=2 ; i*i < n ;i++){
            if(prime[i]){
                for(int j=i*i ; j<n ; j=j+i){
                    prime[j] = false;
                }
            }
        }

        for(int i=2 ; i<n ; i++) {
            if(prime[i]) result++;
        }

        return result;
    }
}
