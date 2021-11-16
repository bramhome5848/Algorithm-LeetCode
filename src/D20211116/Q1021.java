package D20211116;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1021. Remove Outermost Parentheses
 */
public class Q1021 {

    public String removeOuterParentheses1(String s) {

        Queue<Character> que = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        int left = 0;
        int right = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') left++;
            else right++;
            que.add(c);

            if(left == right) {
                que.poll();
                int size = que.size();
                while(size-- >1) result.append(que.poll());

                left = 0;
                right = 0;
                que.clear();
            }
        }

        return result.toString();
    }

    public String removeOuterParentheses2(String s) {

        StringBuilder result = new StringBuilder();
        int open = 0;

        for(char c : s.toCharArray()) {
           if(c == '(' && open++ > 0) result.append(c);
           else if(c == ')' && open-- > 1) result.append(c);
        }

        return result.toString();
    }
}
