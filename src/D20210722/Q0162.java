package D20210722;

/**
 * 162. Find Peak Element
 */
public class Q0162 {

    public int findPeakElement(int[] nums) {

        if(nums.length == 1) return 0;

        int max = nums[0];
        int maxIdx = 0;

        for(int i=1 ; i<nums.length ; i++) {
            if(max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
