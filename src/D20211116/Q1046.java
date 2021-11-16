package D20211116;

import java.util.PriorityQueue;

/**
 * 1046. Last Stone Weight
 */
public class Q1046 {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> que = new PriorityQueue<>((s1, s2) -> s2 - s1);
        for(int stone : stones) que.add(stone);

        while(que.size() > 1) {
            int y = que.poll();
            int x = que.poll();
            if(x != y) que.add(y - x);
        }

        return que.isEmpty() ? 0 : que.poll();
    }
}
