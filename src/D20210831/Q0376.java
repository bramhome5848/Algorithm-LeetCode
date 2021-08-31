package D20210831;

/**
 * 376. Wiggle Subsequence
 */
public class Q0376 {

    //up-down-up-down
    //ex) 1 4 2 5 3 6
    //up[1] = down[0] + 1;
    //up[2] = up[1];
    //down[1] = down[0];
    //down[2] = up[1] + 1;
    public int wiggleMaxLength(int[] nums) {

        if(nums.length == 1) return 1;

        int up = 1;
        int down = 1;

        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i] > nums[i-1]) up = down+1;
            else if(nums[i] < nums[i-1]) down = up+1;
        }

        return Math.max(up, down);
    }
}
