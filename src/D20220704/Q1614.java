package D20220704;

import java.util.Stack;

/**
 * 1614. Maximum Nesting Depth of the Parentheses
 */
public class Q1614 {

    public int maxDepth1(String s) {

        Stack<Character> stack = new Stack<>();
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
                maxDepth = Math.max(maxDepth, stack.size());
            }

            if(c == ')') {
                stack.pop();
            }
        }

        return maxDepth;
    }

    public int maxDepth2(String s) {

        int maxDepth = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            if(c == '(') {
                count++;
                maxDepth = Math.max(maxDepth, count);
            }

            if(c == ')') {
                count--;
            }
        }

        return maxDepth;
    }
}
