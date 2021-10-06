package D20211006;

import java.util.Stack;

/**
 * 456. 132 Pattern
 */
public class Q0456 {

    public boolean find132pattern(int[] nums) {

        int num = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();

        for(int i=nums.length-1 ; i>-1 ; i--) {
            if(nums[i] < num) return true;
            while(!st.isEmpty() && st.peek()<nums[i]) num = st.pop();

            st.push(nums[i]);
        }
        return false;
    }
}
