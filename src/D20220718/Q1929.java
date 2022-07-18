package D20220718;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1929. Concatenation of Array
 */
public class Q1929 {

    public int[] getConcatenation(int[] nums) {

        int[] result = new int[nums.length * 2];

        for(int i=0 ; i<nums.length ; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result;
    }
}
