package D20211111;

/**
 * 922. Sort Array By Parity II
 */
public class Q0922 {

    public int[] sortArrayByParityII(int[] nums) {

        int evenIdx = 0;
        int oddIdx = 1;

        while(evenIdx<nums.length && oddIdx<nums.length) {

            if(nums[evenIdx] % 2 == 0) evenIdx += 2;
            else if(nums[oddIdx] % 2 == 1) oddIdx += 2;
            else {
                nums[evenIdx] = nums[evenIdx] + nums[oddIdx];
                nums[oddIdx] = nums[evenIdx] - nums[oddIdx];
                nums[evenIdx] = nums[evenIdx] - nums[oddIdx];
            }
        }

        return nums;
    }
}
