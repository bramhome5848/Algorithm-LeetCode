package D20211006;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 457. Circular Array Loop
 */
public class Q0457 {

    public boolean circularArrayLoop(int[] nums) {

        for(int i=0 ; i<nums.length ; i++) {
            Set<Integer> set = new HashSet<>();
            int curr = i;
            int count = 0;
            int sign = nums[i] > 0 ? 1 : -1;

            while (!set.contains(curr) && nums[curr] * sign > 0) {
                set.add(curr);
                curr = ((curr + nums[curr]) % nums.length + nums.length) % nums.length;
                count++;

                if (curr == i && count > 1) return true;
            }
        }
        return false;
    }
}
