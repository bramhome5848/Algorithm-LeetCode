package D20210802;

/**
 * 283. Move Zeroes
 */
public class Q0283 {

    public void moveZeroes(int[] nums) {

        int index = 0;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] != 0) nums[index++] = nums[i];
        }

        while(index < nums.length) nums[index++] = 0;
    }
}
