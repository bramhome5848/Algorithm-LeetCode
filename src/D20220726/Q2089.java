package D20220726;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 2089. Find Target Indices After Sorting Array
 */
public class Q2089 {

    public List<Integer> targetIndices1(int[] nums, int target) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] == target) result.add(i);
        }

        return result;
    }

    public List<Integer> targetIndices2(int[] nums, int target) {

        int lCount = 0;
        int bCount = 0;

        for(int num : nums) {
            if(num < target) lCount++;
            if(num > target) bCount++;
        }

        return IntStream.range(lCount, nums.length - bCount)
                .boxed().collect(Collectors.toList());
    }
}
