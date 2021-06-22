package D20210622;

import java.util.*;

/**
 * 15. 3Sum
 */
public class Q0015 {

    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3) return new ArrayList<>();

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length-2 ; i++) {
            int j = i+1;
            int k = nums.length-1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(sum > 0) k--;
                else j++;
            }
        }
        return new ArrayList<>(result);
    }
}
