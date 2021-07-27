package D20210727;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 219. Contains Duplicate II
 */
public class Q0219 {

    public boolean containsNearbyDuplicate1(int[] nums, int k) {

        Map<Integer, Integer> data = new HashMap<>(); //value, index

        for(int i=0 ; i<nums.length ; i++) {
            if(data.containsKey(nums[i]) && i-data.get(nums[i]) <= k) return true;
            else data.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for(int i=0 ; i<nums.length ; i++) {
            if(!set.add(nums[i])) return true;
            if(set.size() > k) set.remove(nums[i-k]);
        }
        return false;
    }
}
