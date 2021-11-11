package D20211111;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 933. Number of Recent Calls
 */
public class Q0933 {
}

class RecentCounter {

    private final Queue<Integer> que;
    public RecentCounter() {
        que = new LinkedList<>();
    }

    public int ping(int t) {

        while(!que.isEmpty() && t-3000 > que.peek()) que.remove();

        que.add(t);

        return que.size();
    }
}
