package D20220121;

/**
 * 1608. Special Array With X Elements Greater Than or Equal X
 */
public class Q1608 {

    public int specialArray(int[] nums) {

        int result = 0;

        while(result <= nums.length) {
            int count = 0;
            for(int num : nums) {
               if(result <= num) count++;
            }

            if(result == count) return result;

            result++;
        }

        return -1;
    }
}
