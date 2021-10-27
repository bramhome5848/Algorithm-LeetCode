package D20211027;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 561. Array Partition I
 */
public class Q0561 {

    public int arrayPairSum1(int[] nums) {

        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length; i += 2) result += nums[i];

        return result;
    }

    public int arrayPairSum2(int[] nums) {

        Arrays.sort(nums);

        return IntStream.range(0, nums.length)
                .filter(idx -> idx%2 == 0).map(i -> nums[i]).sum();
    }
}
