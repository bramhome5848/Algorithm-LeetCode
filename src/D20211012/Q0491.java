package D20211012;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 491. Increasing Subsequences
 */
public class Q0491 {

    public List<List<Integer>> findSubsequences(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        backTrack(0, nums, new ArrayList<>(), set, list);
        return list;
    }

    private void backTrack(int idx, int[] nums, List<Integer> currList, Set<List<Integer>> set, List<List<Integer>> list) {
        if (currList.size() > 1 && set.add(new ArrayList<>(currList))) {
            list.add(new ArrayList<>(currList));
        }

        for (int i=idx ; i<nums.length ; i++) {
            if (currList.size() == 0 || currList.get(currList.size()-1) <= nums[i]) {
                currList.add(nums[i]);
                backTrack(i+1, nums, currList, set, list);
                currList.remove(currList.size()-1);
            }
        }
    }
}
