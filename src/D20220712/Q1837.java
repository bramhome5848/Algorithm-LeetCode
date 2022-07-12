package D20220712;

/**
 * 1837. Sum of Digits in Base K
 */
public class Q1837 {

    public int sumBase(int n, int k) {

        int cnt = 0;

        while(n > 0) {
            cnt += n % k;
            n /= k;
        }

        return cnt;
    }
}
