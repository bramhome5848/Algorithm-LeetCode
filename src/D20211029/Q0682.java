package D20211029;

import java.util.Stack;

/**
 * 682. Baseball Game
 */
public class Q0682 {

    public int calPoints(String[] ops) {

        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for(String op : ops) {
            switch(op) {
                case "+":
                   int last = st.pop();
                   int peek = st.peek();
                   st.push(last);
                   st.push(last + peek);
                   break;
                case "D":
                   st.push(st.peek() * 2);
                   break;
                case "C":
                   st.pop();
                   break;
                default:
                   st.push(Integer.parseInt(op));
                   break;
            }
        }

        return st.stream().mapToInt(s -> s).sum();
    }
}
