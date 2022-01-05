package D20220105;

/**
 * 1413. Minimum Value to Get Positive Step by Step Sum
 */
public class Q1413 {

    public int minStartValue(int[] nums) {

        int result = 1;
        int sum = 0;

        for(int num : nums) {
            sum += num;
            if (sum < 0) result = Math.max(-1 * sum + 1, result);
        }

        return result;
    }
}
