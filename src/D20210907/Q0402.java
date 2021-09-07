package D20210907;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 402. Remove K Digits
 */
public class Q0402 {

    public String removeKDigits(String num, int k) {

        if(num.length() <= 1) return "0";

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int remove = 0;
        int count = 0;

        for(char c : num.toCharArray()) {
           while(remove < k && !stack.isEmpty() && c < stack.peekLast()) {
               stack.removeLast();
               remove++;
           }
           stack.addLast(c);
        }

        while(!stack.isEmpty() && stack.peekFirst() == '0') {
            stack.removeFirst();
            count++;
        }

        while(count < num.length() - k && !stack.isEmpty()) {
            sb.append(stack.removeFirst());
            count++;
        }

        return sb.toString().isEmpty()? "0" : sb.toString();
    }
}
