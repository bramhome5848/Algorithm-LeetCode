package D20210903;

import java.util.Stack;

/**
 * 394. Decode String
 */
public class Q0394 {

    public String decodeString(String s) {

        Stack<Object> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int repeat = 0;

        for(char c : s.toCharArray()) {
           if(Character.isDigit(c)) {
               if(sb.length()!=0){
                   st.push(sb.toString());
                   sb = new StringBuilder();
               }
               repeat = repeat * 10 + c-'0';
           } else if(c == '[') {
               if(repeat != 0){
                   st.push(repeat);
                   repeat = 0;
               }
           } else if(c == ']') {
               st.push(sb.toString());
               sb = new StringBuilder();
               st.push(helper(st));
           } else {
               sb.append(c);
           }
        }

        if(sb.length()!=0) st.push(sb.toString());

        while(!st.isEmpty()) {
            result.insert(0, (String) st.pop());
        }
        return result.toString();
    }

    private String helper(Stack<Object> st){
        StringBuilder sb = new StringBuilder();

        while(!(st.peek() instanceof Integer)){
            sb.insert(0,(String)st.pop());
        }

        return sb.toString().repeat((int) st.pop());
    }
}
