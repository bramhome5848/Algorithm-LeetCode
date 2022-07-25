package D20220725;

/**
 * 2057. Smallest Index With Equal Value
 */
public class Q2057 {

    public int smallestEqual(int[] nums) {

        for(int i=0 ; i< nums.length ; i++) {
            if(i % 10 == nums[i]) return i;
        }

        return -1;
    }
}
