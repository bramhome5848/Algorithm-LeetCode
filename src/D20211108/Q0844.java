package D20211108;

import java.util.Stack;

/**
 * 844. Backspace String Compare
 */
public class Q0844 {

    public boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }

    private String getString(String data) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : data.toCharArray()) {
            if(c == '#') {
                if(!stack.isEmpty()) stack.pop();
            } else stack.push(c);
        }

        while(!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
