package D20211027;

import java.util.Stack;

/**
 * 557. Reverse Words in a String III
 */
public class Q0557 {

    public static String reverseWords1(String s) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == ' ') {
                while(!st.isEmpty()) sb.append(st.pop());
                sb.append(' ');
            } else st.push(c);
        }

        if(!st.isEmpty()) {
            while(!st.isEmpty()) sb.append(st.pop());
        }

        return sb.toString();
    }

    public static String reverseWords2(String s) {

        String[] data = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String d : data) {
           sb.append(new StringBuilder(d).reverse());
           sb.append(' ');
        }

        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
