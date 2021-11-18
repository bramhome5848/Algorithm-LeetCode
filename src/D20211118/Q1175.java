package D20211118;

/**
 * 1175. Prime Arrangements
 */
public class Q1175 {

    public int numPrimeArrangements(int n) {

        int [] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        int count = n >= 97 ? primes.length : 0;

        for(int i=0 ; i<primes.length ; i++) {
            if(primes[i] >= n) {
                count = primes[i] > n ? i : i + 1;
                break;
            }
        }

        return (int) (fact(count) * fact(n - count) % 1000000007);
    }

    private long fact(int num){
        if(num <= 1) return 1;
        return (num * fact(num - 1)) % 1000000007;
    }
}
