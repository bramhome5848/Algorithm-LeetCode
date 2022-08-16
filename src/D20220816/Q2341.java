package D20220816;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2341. Maximum Number of Pairs in Array
 */
public class Q2341 {

    public int[] numberOfPairs(int[] nums) {

        int pairNum = 0;
        int rem = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Integer count : map.values()) {
            pairNum += count / 2;
            rem += count % 2;
        }

        return new int[]{pairNum, rem};
    }
}
