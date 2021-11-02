package D20211102;


/**
 * 747. Largest Number At Least Twice of Others
 */
public class Q0747 {

    public int dominantIndex(int[] nums) {

        if(nums.length == 1) return 0;

        int first = 0;
        int second = 0;
        int idx = 0;

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] > first) {
                idx = i;
                second = first;
                first = nums[i];
            } else if(nums[i] > second) second = nums[i];
        }

        return first < 2 * second ? -1 : idx;
    }
}
