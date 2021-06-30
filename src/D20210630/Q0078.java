package D20210630;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 */
public class Q0078 {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0 ; i<(1<<nums.length) ; i++) {
            List<Integer> sub = new ArrayList<>();
            for(int k=0 ; k<nums.length ; k++) {
                if ((i&(1<<k)) != 0) sub.add(nums[k]);
            }
            result.add(sub);
        }
        return result;
    }
}
