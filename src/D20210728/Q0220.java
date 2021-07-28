package D20210728;

import java.util.TreeSet;

/**
 * 220. Contains Duplicate III
 */
public class Q0220 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        if(nums == null || nums.length == 0 || k<= 0) return false;

        TreeSet<Long> set = new TreeSet<>();

        for(int i=0 ; i<nums.length ; i++) {
            Long floor = set.floor((long)nums[i]);
            if(floor != null && nums[i]-floor <= t) return true;

            Long ceiling = set.ceiling((long)nums[i]);
            if(ceiling!=null && ceiling-nums[i] <= t) return true;

            set.add((long)nums[i]);
            if(set.size() > k) set.remove((long)nums[i-k]);
        }
        return false;
    }
}
