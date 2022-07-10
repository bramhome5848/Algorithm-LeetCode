package D20220710;

/**
 * 1752. Check if Array Is Sorted and Rotated
 */
public class Q1752 {

    public boolean check(int[] nums) {

        int count = 0;

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i-1] > nums[i]) count++;
        }

        if(nums[nums.length-1] > nums[0]) count++;

        return count <= 1;
    }
}
