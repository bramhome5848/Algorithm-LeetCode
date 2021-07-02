package D20210702;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. Subsets II
 */
public class Q0090 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        getValue(0, nums, result, new ArrayList<>());
        return result;
    }

    public void getValue(int index, int[] nums,
                         List<List<Integer>> result, List<Integer> subset) {

        result.add(new ArrayList<>(subset));

        for(int i=index ; i<nums.length ; i++) {
            if(i>index && nums[i] == nums[i-1]) continue;

            subset.add(nums[i]);
            getValue(i+1, nums, result, subset);
            subset.remove(subset.size()-1);
        }
    }
}
