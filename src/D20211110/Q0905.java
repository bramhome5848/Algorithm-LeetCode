package D20211110;

/**
 * 905. Sort Array By Parity
 */
public class Q0905 {

    public int[] sortArrayByParity(int[] nums) {

        int idx = 0;

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx++] = temp;
            }
        }

        return nums;
    }
}
