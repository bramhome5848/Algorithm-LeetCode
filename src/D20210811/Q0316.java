package D20210811;

import java.util.Stack;

/**
 * 316. Remove Duplicate Letters
 */
public class Q0316 {

    public String removeDuplicateLetters1(String s) {

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int[] lastIdx = new int[26];
        boolean[] used = new boolean[26];

        for(int i=0 ; i<s.length() ; i++) {
            lastIdx[s.charAt(i) - 'a'] = i; // save last index;
        }

        for(int i=0 ; i<s.length() ; i++) {
            int val = s.charAt(i) - 'a';
            if(used[val]) continue;

            while(!stack.isEmpty() && val<stack.peek() && i<lastIdx[stack.peek()]) {
                used[stack.pop()] = false;
            }

            stack.push(val);
            used[val] = true;
        }

        while(!stack.isEmpty()) sb.append((char)(stack.pop()+'a'));
        return sb.reverse().toString();
    }
}
