package D20210721;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * 155. Min Stack
 */
public class Q0155 {

    public static class MinStack {

        Stack<Integer> stack;
        PriorityQueue<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new PriorityQueue<>();
        }

        public void push(int val) {
            stack.push(val);
            minStack.add(val);
        }

        public void pop() {
            if(!stack.isEmpty() && !minStack.isEmpty()) {
                minStack.remove(stack.pop());
            }
        }

        public int top() {
            if(!stack.isEmpty()) {
                return stack.peek();
            }
            return 0;
        }

        public int getMin() {
            if(!stack.isEmpty() && !minStack.isEmpty()) {
                return minStack.peek();
            }
            return 0;
        }
    }
}
