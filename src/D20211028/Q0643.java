package D20211028;

import java.util.Arrays;

/**
 * 643. Maximum Average Subarray I
 */
public class Q0643 {

    public double findMaxAverage1(int[] nums, int k) {

        int[] sumArray = new int[nums.length];
        int idx = 0;

        sumArray[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++) sumArray[i] = sumArray[i-1] + nums[i];

        double result = (double) sumArray[k-1] / k;
        for(int i=k ; i<nums.length ; i++) {
            result = Math.max(result, (double)(sumArray[i] - sumArray[idx++])/k);
        }
        return result;
    }

    public double findMaxAverage2(int[] nums, int k) {

        int sum = Arrays.stream(nums).limit(k).sum();
        int max = sum;

        for(int i=k ; i<nums.length ; i++) {
            sum += nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }

        return (double) max / (double) k;
    }
}
