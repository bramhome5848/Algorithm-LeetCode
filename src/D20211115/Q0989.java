package D20211115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989. Add to Array-Form of Integer
 */
public class Q0989 {

    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<>();

        for(int i=num.length-1 ; i>-1 ; i--) {
            int sum = num[i] + k;
            result.add(sum % 10);
            k = sum / 10;
        }

        while(k > 0) {
            result.add(k % 10);
            k /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}
