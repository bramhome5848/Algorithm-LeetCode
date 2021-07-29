package D20210729;

import java.util.Stack;

/**
 * 227. Basic Calculator II
 */
public class Q0227 {

    public int calculate(String s) {

        if(s == null || s.length() ==0) return 0;

        Stack<Integer> stack = new Stack<>();
        int val = 0;
        int result = 0;
        char operation = '+';

        for(int i=0 ; i<s.length() ; i++) {
            if(Character.isDigit(s.charAt(i))) {
                val = val * 10 + (s.charAt(i) - '0');
            }

            if ((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i == s.length() - 1) {
                switch (operation) {
                    case '+':
                        stack.push(val);
                        break;
                    case '-':
                        stack.push(-val);
                        break;
                    case '*':
                        stack.push(stack.pop() * val);
                        break;
                    default:
                        stack.push(stack.pop() / val);
                        break;
                }
                operation = s.charAt(i);
                val = 0;
            }
        }

        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
