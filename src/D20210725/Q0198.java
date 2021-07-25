package D20210725;

/**
 * 198. House Robber
 */
public class Q0198 {

    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];

        //nums[i] -> i번째 집을 털었을 때 얻을 수 있는 최대 금액
        //인접한 집은 털 수 없음
        for(int i=1 ; i<nums.length ; i++) {
            int prev1 = 0;
            int prev2 = 0;

            if(i-2 >= 0) prev1 = nums[i-2];
            if(i-3 >= 0) prev2 = nums[i-3];

            nums[i] += Math.max(prev1, prev2);
        }
        return Math.max(nums[nums.length-1], nums[nums.length-2]);
    }
}
