package D20210624;

/**
 * 27. Remove Element
 */
public class Q0027 {

    public int removeElement(int[] nums, int val) {

        int index = 0;

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] != val) nums[index++] = nums[i];
        }

        return index;
    }
}
