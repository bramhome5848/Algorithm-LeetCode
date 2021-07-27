package D20210727;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Stream;

/**
 * 215. Kth Largest Element in an Array
 */
public class Q0215 {

    public int findKthLargest1(int[] nums, int k) {

        return Arrays.stream(nums).boxed()
                .sorted((s1, s2) -> s2 - s1)
                .skip(k - 1)
                .toArray(Integer[]::new)[0];
    }

    public int findKthLargest2(int[] nums, int k) {

        PriorityQueue<Integer> que = new PriorityQueue<>((s1, s2) -> s2 - s1);

        for(int num : nums) que.add(num);
        while(k-- > 1) que.poll();

        return que.isEmpty() ? 0 : que.peek();
    }
}
