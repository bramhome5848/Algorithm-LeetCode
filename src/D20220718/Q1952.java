package D20220718;


/**
 * 1952. Three Divisors
 */
public class Q1952 {

    public boolean isThree(int n) {

        int count = 0;
        for(int i=1 ; i * i<=n ; i++) {
            if(i * i == n) count++;
            else if(n % i == 0) count += 2;

            if(count > 3) return false;
        }

        return count == 3;
    }
}
