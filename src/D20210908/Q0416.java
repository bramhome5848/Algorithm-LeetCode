package D20210908;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q0416 {

    //전체 sum 의 절반 값 == 합인 조합이 있는가
    public boolean canPartition(int[] nums) {

        int sum = Arrays.stream(nums).sum();
        if(sum % 2 != 0) return false;

        Map<Integer, Boolean> map = new HashMap<>();
        return isPossible(nums, sum/2, 0, map);
    }

    private boolean isPossible(int[] nums, int sum, int idx, Map<Integer, Boolean> map) {

        if(map.containsKey(sum)) return map.get(sum);
        if(sum == 0) return true;
        if(sum < 0) return false;

        for(int i=idx ; i<nums.length ; i++) {
            map.put(sum, isPossible(nums, sum - nums[i], i+1, map));
            if(map.get(sum)) return true;
        }
        return false;
    }
}
