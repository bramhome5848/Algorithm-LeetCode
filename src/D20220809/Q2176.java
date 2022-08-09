package D20220809;

/**
 * 2176. Count Equal and Divisible Pairs in an Array
 */
public class Q2176 {

    public int countPairs(int[] nums, int k) {

        int result = 0;

        for(int i=0 ; i<nums.length ; i++) {
            for(int j=i+1 ; j<nums.length ; j++) {
                if(nums[i] == nums[j] && (i * j) % k == 0) result++;
            }
        }

        return result;
    }
}
