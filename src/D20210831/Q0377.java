package D20210831;

/**
 * 377. Combination Sum IV
 */
public class Q0377 {

    public int combinationSum4(int[] nums, int target) {

        if(nums == null || nums.length == 0) return 0;

        int[] result = new int[target+1];
        result[0] = 1;

        for(int i=0 ; i<target+1 ; i++) {
            for(int num : nums) {
                if (i + num <= target) result[i + num] += result[i];
            }
        }
        return result[target];
    }
}
