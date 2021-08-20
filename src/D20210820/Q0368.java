package D20210820;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 368. Largest Divisible Subset
 */
public class Q0368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {

        List<Integer> result = new ArrayList<>();
        int[] dp = new int[nums.length]; //i까지 가능한 개수
        int max = 1;
        int prev = -1;

        Arrays.fill(dp, 1);
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length ; i++) {
            for(int j=0 ; j<i ; j++) {
                if(nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    max = Math.max(max, dp[i]);
                }
            }
        }

        for(int i=nums.length-1 ; i>-1 ; i--) {
            if(dp[i] == max && (prev == -1 || prev % nums[i] == 0)) {
                result.add(nums[i]);
                prev = nums[i];
                max--;
            }
        }

        return result;
    }
}
