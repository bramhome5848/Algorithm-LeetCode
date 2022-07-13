package D20220713;

import java.util.ArrayList;
import java.util.List;

/**
 * 1863. Sum of All Subset XOR Totals
 */
public class Q1863 {

    //bit manipulation
    public int subsetXORSum1(int[] nums) {

        int length = nums.length;
        int sum = 0;

        for(int i=1 ; i<(1<<length) ; i++) {
            int subSum = 0; //xor 항등원 0
            for(int j=0 ; j<nums.length ; j++) {
                if ((i & (1 << j)) != 0) subSum ^= nums[j];
            }
            sum += subSum;
        }

        return sum;
    }

    //recursion
    public int subsetXORSum2(int[] nums) {
        return subset(nums, 0, nums.length, 0);
    }

    private int subset(int[] nums, int start, int end, int ans){
        if(start == end) return ans;
        return subset(nums, start + 1, end, ans ^ nums[start])
                + subset(nums, start + 1, end, ans);
    }
}
