package D20210916;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. Find All Duplicates in an Array
 */
public class Q0442 {

    //must write an algorithm that runs in O(n) time and uses only constant extra space.
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for(int num : nums) {
            int idx = Math.abs(num) - 1;
            if (nums[idx] < 0) result.add(idx + 1);
            nums[idx] = -nums[idx];
        }

        return result;
    }
}
