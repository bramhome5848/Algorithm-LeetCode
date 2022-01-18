package D20220118;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1464. Maximum Product of Two Elements in an Array
 */
public class Q1464 {

    public int maxProduct1(int[] nums) {

        Arrays.sort(nums);
        return (nums[nums.length-1] - 1) * (nums[nums.length-2] - 1);
    }

    public int maxProduct2(int[] nums) {

        List<Integer> data = Arrays.stream(nums).boxed()
                .sorted((s1, s2) -> s2 - s1).limit(2).collect(Collectors.toList());

        return (data.get(0) - 1) * (data.get(1) - 1);
    }

    public int maxProduct3(int[] nums) {

        int max1 = -1;
        int max2 = -1;

        for(int num : nums) {
           if(max1 == -1 || num > max1) {
               max2 = max1;
               max1 = num;
           } else if(max2 == -1 || num > max2) {
               max2 = num;
           }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
