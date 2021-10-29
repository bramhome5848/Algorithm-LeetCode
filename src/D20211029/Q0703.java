package D20211029;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 703. Kth Largest Element in a Stream
 */
public class Q0703 {
}

class KthLargest {

    private final PriorityQueue<Integer> heap;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>();
        Arrays.stream(nums).forEach(this::add);
    }

    public int add(int val) {
        heap.add(val);
        if(heap.size() > k) heap.poll();
        return heap.peek();
    }
}
