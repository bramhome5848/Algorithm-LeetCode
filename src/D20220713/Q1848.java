package D20220713;

/**
 * 1848. Minimum Distance to the Target Element
 */
public class Q1848 {

    public int getMinDistance(int[] nums, int target, int start) {

        int idx = Integer.MAX_VALUE;

        for(int i=0 ; i<nums.length ; i++) {
            if(target == nums[i]) {
                idx = Math.min(idx, Math.abs(i - start));
            }
        }

        return idx;
    }
}
