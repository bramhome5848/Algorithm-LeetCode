package D20220117;

import java.util.Arrays;

/**
 * 1460. Make Two Arrays Equal by Reversing Sub-arrays
 */
public class Q1460 {

    public boolean canBeEqual(int[] target, int[] arr) {

        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target, arr);
    }
}
