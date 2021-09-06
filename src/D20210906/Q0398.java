package D20210906;

import java.util.*;

/**
 * 398. Random Pick Index
 */
public class Q0398 {
}

class Solution {

    //value, index
    private final Map<Integer, List<Integer>> map;

    public Solution(int[] nums) {

        map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        int idx = (int) (Math.random() * list.size());
        return list.get(idx);
    }
}
