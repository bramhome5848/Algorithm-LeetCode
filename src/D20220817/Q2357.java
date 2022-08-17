package D20220817;

import java.util.HashSet;
import java.util.Set;

/**
 * 2357. Make Array Zero by Subtracting Equal Amounts
 */
public class Q2357 {

    public int minimumOperations(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int count = 0;

        for(int num : nums) {
            if(num > 0) set.add(num);
        }

        return set.size();
    }
}
