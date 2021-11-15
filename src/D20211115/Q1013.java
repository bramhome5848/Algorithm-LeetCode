package D20211115;

import java.util.Arrays;

/**
 * 1013. Partition Array Into Three Parts With Equal Sum
 */
public class Q1013 {

    public boolean canThreePartsEqualSum(int[] arr) {

        int sumAll = Arrays.stream(arr).sum();
        if(sumAll % 3 != 0) return false;

        int target = sumAll / 3;
        int sum = 0;
        int count = 0;

        for(int num : arr) {
            sum += num;
            if(sum == target) {
                count++;
                sum = 0;
            }
        }

        return count >= 3;
    }
}
