package D20220722;

import java.util.ArrayList;
import java.util.List;

/**
 * 2032. Two Out of Three
 */
public class Q2032 {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> result = new ArrayList<>();
        boolean[][] isExist = new boolean[3][101];

        for (int num : nums1) isExist[0][num] = true;
        for (int num : nums2) isExist[1][num] = true;
        for (int num : nums3) isExist[2][num] = true;

        for(int i=0 ; i<101 ; i++) {
            if((isExist[0][i] && isExist[1][i])
                    || (isExist[1][i] && isExist[2][i])
                    || (isExist[2][i] && isExist[0][i])) result.add(i);
        }

        return result;
    }
}
