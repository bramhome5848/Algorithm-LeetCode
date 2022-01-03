package D20220103;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 */
public class Q1365 {

    public int[] smallerNumbersThanCurrent1(int[] nums) {

        Map<Integer, Integer> data = new HashMap<>();
        int[] result = nums.clone();
        int count = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                data.put(nums[i], count);
                count = i+1;
            }
        }

        for(int i = 0; i < nums.length; i++) result[i] = data.get(result[i]);
        return result;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {

        int[] result = new int[101];
        for(int num : nums) result[num]++;

        for(int i=1 ; i<result.length ; i++) result[i] += result[i-1];
        for(int i=0 ; i<nums.length ; i++) {
            nums[i] = nums[i] == 0 ? 0 : result[nums[i]-1];
        }

        return nums;
    }
}
