package D20220105;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 1403. Minimum Subsequence in Non-Increasing Order
 */
public class Q1403 {

    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> pQue = new PriorityQueue<>((p1, p2) -> p2 - p1);

        int total = 0;
        int rem = 0;

        for(int num : nums) {
            pQue.add(num);
            total += num;
        }

        while(rem <= total && !pQue.isEmpty()) {
            int value = pQue.poll();
            result.add(value);
            total -= value;
            rem += value;
        }

        return result;
    }
}
