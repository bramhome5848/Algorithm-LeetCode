package D20211110;

/**
 * 896. Monotonic Array
 */
public class Q0896 {

    public boolean isMonotonic(int[] nums) {

        boolean up = true;
        boolean down = true;

        for(int i=0 ; i<nums.length-1 ; i++) {
            if(nums[i] > nums[i+1]) up = false;
            if(nums[i] < nums[i+1]) down = false;
        }

        return up || down;
    }
}
