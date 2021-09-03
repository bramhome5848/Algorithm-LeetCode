package D20210903;

/**
 * 396. Rotate Function
 */
public class Q0396 {

    /**
     * F(0) = (0 * a) + (1 * b) + (2 * c) + (3 * d) + (4 * e) = 0 + b + 2c + 3d + 4e
     * F(1) = (1 * a) + (2 * b) + (3 * c) + (4 * d) + (0 * e) = a + 2b + 3c + 4d + 0
     * F(2) = (2 * a) + (3 * b) + (4 * c) + (0 * d) + (1 * e) = 2a + 3b + 4c + 0 + e
     *
     * F(1) = F(0) + a + b + c + d + e - 5e = F(0) + SUM - N*e
     * F(2) = F(1) + a + b + c + d + e - 5d = F(1) + SUM - N*d
     * F(K) = F(K-1) + SUM - N * (( K-1)th element from end of array)
     */
    public int maxRotateFunction(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int[] result = new int[nums.length];
        int sum = 0;
        int start = 0;
        int max;

        for(int i=0 ; i<nums.length ; i++) {
            sum += nums[i];
            start += i * nums[i];
        }

        result[0] = start;
        max = start;

        for(int i=1 ; i<nums.length ; i++) {
            result[i] = result[i-1] + sum - nums.length * nums[nums.length-i];
            max = Math.max(max, result[i]);
        }

        return max;
    }
}
