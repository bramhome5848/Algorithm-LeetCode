package D20220809;

/**
 * 2180. Count Integers With Even Digit Sum
 */
public class Q2180 {

    public int countEven(int num) {
        int result = 0;

        for(int i=1 ; i<num+1 ; i++) {
            if(isSumEven(i)) result++;
        }

        return result;
    }

    private boolean isSumEven(int value) {
        int sum = 0;

        while(value != 0) {
            sum += value % 10;
            value /= 10;
        }

        return sum % 2 == 0;
    }
}
