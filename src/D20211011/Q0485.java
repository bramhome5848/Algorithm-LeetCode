package D20211011;

/**
 * 485. Max Consecutive Ones
 */
public class Q0485 {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int result = 0;

        for(int num : nums) {
           if(num == 1) {
               count++;
           } else {
               result = Math.max(result, count);
               count = 0;
           }
        }

        return Math.max(result, count);
    }
}
