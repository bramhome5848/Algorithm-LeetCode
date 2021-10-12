package D20211012;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 496. Next Greater Element I
 */
public class Q0496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[nums1.length];
        int idx = 0;

        for(int num : nums2) {
           while(!stack.isEmpty() && num > stack.peek()) map.put(stack.pop(), num);
           stack.push(num);
        }

        for(int num : nums1) {
           result[idx++] = map.getOrDefault(num, -1);
        }
        return result;
    }
}
