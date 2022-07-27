package D20220727;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2099. Find Subsequence of Length K With the Largest Sum
 */
public class Q2099 {

    public int[] maxSubsequence(int[] nums, int k) {

        int[][] seq = new int[nums.length][2];

        for(int i=0 ; i<nums.length ; i++) {
            seq[i][0] = nums[i];
            seq[i][1] = i;
        }

        return Arrays.stream(seq).sorted((a, b) -> b[0] - a[0])
                .limit(k).sorted(Comparator.comparingInt(a -> a[1]))
                .mapToInt(a -> a[0]).toArray();
    }
}
