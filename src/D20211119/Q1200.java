package D20211119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200. Minimum Absolute Difference
 */
public class Q1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for(int i=1 ; i<arr.length ; i++) {
            if(arr[i] - arr[i-1] < minDiff) {
                result.clear();
                result.add(List.of(arr[i-1], arr[i]));
                minDiff = arr[i] - arr[i-1];
            } else if(arr[i] - arr[i-1] == minDiff) result.add(List.of(arr[i-1], arr[i]));
        }

        return result;
    }
}
