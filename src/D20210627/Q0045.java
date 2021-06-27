package D20210627;

/**
 * 45. Jump Game II
 */
public class Q0045 {

    public int jump(int[] nums) {

        int[] result = new int[nums.length];

        for(int i=0 ; i<nums.length ; i++) {
            for(int j=i+1 ; j<nums.length && j <= i+nums[i] ; j++) {
                if(result[j] == 0 || result[i] + 1 < result[j]) result[j] = result[i] + 1;
            }
        }
        return result[nums.length-1];
    }
}
