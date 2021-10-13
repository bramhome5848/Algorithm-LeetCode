package D20211013;

import java.util.Stack;

/**
 * 503. Next Greater Element II
 */
public class Q0503 {

    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];

        for(int i=nums.length-1 ; i>-1 ; i--) stack.push(nums[i]);
        for(int i=nums.length-1 ; i>-1 ; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums[i]) stack.pop();

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
}
