package D20220708;

/**
 * 1716. Calculate Money in Leetcode Bank
 */
public class Q1716 {

    public int totalMoney(int n) {

        int weekday = 1;
        int count = 1;
        int result = 0;

        for(int i=1 ; i<n+1 ; i++) {
            result += count++;

            if(i % 7 == 0) {
                weekday++;
                count = weekday;
            }
        }

        return result;
    }
}
