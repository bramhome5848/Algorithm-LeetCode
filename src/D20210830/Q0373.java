package D20210830;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 373. Find K Pairs with Smallest Sums
 */
public class Q0373 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        if(nums1.length == 0 || nums2.length == 0 || k == 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> que = new PriorityQueue<>((p1, p2) -> p1[0] + p1[1] - p2[0] - p2[1]);

        //nums[1] value, nums2 -> [0] value, index 0;
        for (int num : nums1) {
            que.add(new int[]{num, nums2[0], 0});
        }

        while(k-- != 0 && !que.isEmpty()) {

            int[] curr = que.poll();
            result.add(List.of(curr[0], curr[1]));

            if(curr[2]+1 < nums2.length) {
                que.add(new int[]{curr[0], nums2[curr[2]+1], curr[2] + 1});
            }
        }
        return result;
    }
}
