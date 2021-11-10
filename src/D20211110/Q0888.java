package D20211110;

import java.util.Arrays;

/**
 * 888. Fair Candy Swap
 */
public class Q0888 {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumAlice = Arrays.stream(aliceSizes).sum();
        int sumBob = Arrays.stream(bobSizes).sum();
        int diff = (sumAlice - sumBob) / 2;

        for(int aliceSize : aliceSizes) {
            for(int bobSize : bobSizes) {
               if(aliceSize == bobSize + diff) return new int[]{aliceSize, bobSize};
            }
        }
        return null;
    }
}
