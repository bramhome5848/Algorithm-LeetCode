package D20210812;

import java.util.Arrays;

/**
 * 324. Wiggle Sort II
 */
public class Q0324 {

    //wiggle sort : nums[0] < nums[1] > nums[2] < nums[3]
    //O(n) time, O(n)
    public void wiggleSort1(int[] nums) {

        int n = nums.length - 1;
        int[] data = Arrays.copyOf(nums,nums.length);
        Arrays.sort(data);

        for(int i=1 ; i<nums.length ; i+=2) nums[i] = data[n--];
        for(int i=0 ; i<nums.length ; i+=2) nums[i] = data[n--];
    }
}
