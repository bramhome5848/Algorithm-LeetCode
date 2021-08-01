package D20210801;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 260. Single Number III
 */
public class Q0260 {

    //map, counting
    public int[] singleNumber1(int[] nums) {

        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() < 2)
                .mapToInt(Map.Entry::getKey).toArray();
    }

    //bit manipulation
    public static int[] singleNumber2(int[] nums) {

        int xor = 0;
        int x = 0;
        int y = 0;
        int mask = 0;

        for (int num : nums) {
            xor ^= num;
        }

        mask = (xor & (~xor + 1));

        for (int num : nums) {
            if ((mask & num) == 0) x ^= num;
            else y ^= num;
        }

        return new int[]{x, y};
    }
}
