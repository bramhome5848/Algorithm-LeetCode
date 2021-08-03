package D20210803;

/**
 * 287. Find the Duplicate Number
 */
public class Q0287 {

    /**
     * must solve the problem without modifying the array nums
     * and uses only constant extra space
     * - Floyd hare and tortoise algorithm
     */
    public int findDuplicate(int[] nums) {

        int hare = 0;
        int tort = 0;
        do {
            hare = nums[nums[hare]];
            tort = nums[tort];
        } while(hare != tort);

        tort=0;
        while(hare != tort){
            hare = nums[hare];
            tort = nums[tort];
        }

        return hare;
    }
}
