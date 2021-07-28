package D20210728;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 225. Implement Stack using Queues
 */
public class Q0225 {
}

class MyStack {

    Deque<Integer> que;

    /** Initialize your data structure here. */
    public MyStack() {
        que = new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        que.addFirst(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return que.isEmpty() ? 0 : que.pollFirst();
    }

    /** Get the top element. */
    public int top() {
        return que.isEmpty() ? 0 : que.peekFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return que.size() == 0;
    }
}
