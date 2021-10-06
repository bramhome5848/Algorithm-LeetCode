package D20211006;

import java.util.HashMap;
import java.util.Map;

/**
 * 454. 4Sum II
 */
public class Q0454 {

    //1 <= nums.length <= 200
    //200 * 200 * 200 * 200 -> 모두 다 해볼 수 없다
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Map<Integer, Integer> data = new HashMap<>();
        int count = 0;

        for(int num1 : nums1) {
            for(int num2 : nums2) {
               data.put(num1 + num2, data.getOrDefault(num1 + num2, 0) + 1);
            }
        }

        for(int num3 : nums3) {
            for(int num4 : nums4) {

                int key = num3 + num4;
                if(data.containsKey(-key)) count += data.get(-key);
            }
        }

        return count;
    }
}
