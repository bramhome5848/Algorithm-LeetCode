package D20210706;

import java.util.PriorityQueue;

/**
 * 128. Longest Consecutive Sequence
 */
public class Q0128 {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        PriorityQueue<Integer> que = new PriorityQueue<>();
        int currentL = 1;
        int maxL = 1;

        for(int value : nums) {
            que.add(value);
        }

        while(!que.isEmpty()) {
            int value = que.poll();
            if(que.peek() != null) {
                if(que.peek() == value+1) currentL++;
                else if(que.peek() == value) continue;
                else currentL = 1;
            }
            maxL = Math.max(maxL, currentL);
        }
        return maxL;
    }
}
