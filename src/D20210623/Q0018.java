package D20210623;

import java.util.*;

/**
 * 18. 4Sum
 */
public class Q0018 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length-3 ; i++) {
            for(int j=nums.length-1 ; j>i+2 ; j--) {
                int remain = target - nums[i] - nums[j];
                int left = i+1;
                int right = j-1;
                while(left < right) {
                    if(nums[left] + nums[right] < remain) left++;
                    else if(nums[left] + nums[right] > remain) right--;
                    else {
                        set.add(Arrays.asList(nums[i], nums[left], nums[right], nums[j]));
                        left++;
                        right--;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
