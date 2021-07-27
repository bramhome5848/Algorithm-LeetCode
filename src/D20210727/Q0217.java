package D20210727;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 217. Contains Duplicate
 */
public class Q0217 {

    //6ms, 44.8MB
    public boolean containsDuplicate1(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    //3ms, 42.1MB
    public boolean containsDuplicate2(int[] nums) {

        Arrays.sort(nums);

        for(int i=0 ; i<nums.length-1 ; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    //15 ms, 48.2 MB
    public boolean containsDuplicate3(int[] nums) {

        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .values().stream().anyMatch(s -> s > 1);

    }
}
