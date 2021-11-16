package D20211116;

import java.util.ArrayList;
import java.util.List;

/**
 * 1018. Binary Prefix Divisible By 5
 */
public class Q1018 {

    public List<Boolean> prefixesDivBy5(int[] nums) {

        List<Boolean> result = new ArrayList<>();
        int sum = 0;

        for(int num : nums) {
            sum = sum*2 + num;
            if(sum % 5 == 0) result.add(true);
            else result.add(false);
            sum %= 5;
        }

        return result;
    }
}
