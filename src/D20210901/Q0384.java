package D20210901;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 384. Shuffle an Array
 */
public class Q0384 {
}

class Solution {

    private final int[] nums;
    private final Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums.clone();
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] result = new int[nums.length];
        List<Integer> availIdxList = IntStream.range(0, nums.length).boxed().collect(Collectors.toList());

        for(int num : nums) {
            int idx = random.nextInt(availIdxList.size());
            result[availIdxList.get(idx)] = num;
            availIdxList.remove(idx);
        }
        return result;
    }
}
