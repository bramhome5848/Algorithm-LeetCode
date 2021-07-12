package D20210712;

/**
 * 136. Single Number
 */
public class Q0136 {

    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0 ; i<nums.length ; i++){
            result ^=nums[i];
        }
        return result;
    }
}
