package D20220708;

import java.util.Arrays;

/**
 * 1710. Maximum Units on a Truck
 */
public class Q1710 {

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (b1, b2) -> b2[1] - b1[1]);
        int max = 0;

        for (int[] boxType : boxTypes) {
            if (boxType[0] > truckSize) {
                max += truckSize * boxType[1];
                return max;
            } else {
                truckSize -= boxType[0];
                max += boxType[0] * boxType[1];
            }
        }

        return max;
    }
}