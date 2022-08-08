package D20220808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 2164. Sort Even and Odd Indices Independently
 */
public class Q2164 {

    public int[] sortEvenOdd(int[] nums) {

        if(nums.length < 3) return nums;

        int[] evenArray = new int[nums.length / 2 + nums.length % 2];
        int[] oddArray = new int[nums.length / 2 + nums.length % 2];

        for(int i=0 ; i<nums.length ; i++) {
            if(i % 2 == 0) evenArray[i / 2] = nums[i];
            else oddArray[i / 2] = nums[i];
        }

        Arrays.sort(evenArray);
        Arrays.sort(oddArray);

        for(int i=0 ; i<nums.length ; i++) {
            if(i % 2 == 0) nums[i] = evenArray[i / 2];
            else nums[i] = oddArray[oddArray.length - 1 - i / 2];
        }

        return nums;
    }
}
