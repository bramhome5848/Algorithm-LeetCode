package D20211028;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Q0645 {

    public int[] findErrorNums(int[] nums) {

        int[] freq = new int[nums.length+1];
        int[] result = new int[2];

        for(int num : nums) freq[num]++;
        for(int i=1 ; i<nums.length+1 ; i++) {
            if (freq[i] == 0) result[1] = i;
            if (freq[i] == 2) result[0] = i;
        }

        return result;
    }
}
