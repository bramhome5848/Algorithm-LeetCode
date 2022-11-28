package M20221128;

import java.util.*;

/**
 * 15. 3Sum
 */
public class Q0015 {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length-2 ; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum > 0) k--;
                else if(sum < 0) j++;
                else result.add(List.of(nums[i], nums[j++], nums[k--]));
            }
        }

        return new ArrayList<>(result);
    }
}
