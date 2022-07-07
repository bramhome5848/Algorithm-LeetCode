package D20220707;

/**
 * 1688. Count of Matches in Tournament
 */
public class Q1688 {

    public int numberOfMatches(int n) {

        int result = 0;
        while(n != 1) {
            if(n % 2 == 0) {
                result += n / 2;
                n /= 2;
            } else {
                result += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return result;
    }
}
