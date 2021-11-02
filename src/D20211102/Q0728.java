package D20211102;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 */
public class Q0728 {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        while(left <= right) {
            if(isDividing(left)) result.add(left);
            left++;
        }
        return result;
    }

    private boolean isDividing(int n) {

        int num = n;
        while(num > 0) {
            int digit = num % 10;
            if(digit == 0 || n % digit != 0) return false;
            num /= 10;
        }
        return true;
    }
}
