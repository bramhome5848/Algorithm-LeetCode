package D20220729;

import java.util.Arrays;

/**
 * 2148. Count Elements With Strictly Smaller and Greater Elements
 */
public class Q2148 {

    public int countElements(int[] nums) {

        int min = Arrays.stream(nums).min().orElse(0);
        int max = Arrays.stream(nums).max().orElse(0);
        int result = 0;

        for(int num : nums) {
           if(min < num && num < max) result++;
        }

        return result;
    }
}
