package D20210715;

import java.util.Stack;

/**
 * 150. Evaluate Reverse Polish Notation
 */
public class Q0150 {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int numFirst = 0;
        int numSecond = 0;

        for(int i=0 ; i<tokens.length ; i++) {
            if(isOperator(tokens[i])) {

                numSecond = stack.pop();
                numFirst = stack.pop();
                char operation = tokens[i].charAt(0);

                switch (operation) {
                    case '+':
                        result = numFirst + numSecond;
                        break;
                    case '-':
                        result = numFirst - numSecond;
                        break;
                    case '*':
                        result = numFirst * numSecond;
                        break;
                    default:
                        result = numFirst / numSecond;
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String data) {
        char c = data.charAt(0);
        return data.length() == 1 && (c == '+' || c == '-' || c == '*' || c == '/' );
    }
}
