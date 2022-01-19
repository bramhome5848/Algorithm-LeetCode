package D20220119;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1539. Kth Missing Positive Number
 */
public class Q1539 {

    public int findKthPositive1(int[] arr, int k) {

        Set<Integer> set = IntStream.range(1, arr[arr.length-1] + k + 1).boxed().collect(Collectors.toSet());
        Set<Integer> arrSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        set.removeAll(arrSet);

        int count = 1;

        for(Integer value : set) {
            if(k == count++) return value;
        }

        return 0;
    }

    public int findKthPositive2(int[] arr, int k) {

        k -= arr[0] - 1;    //arr[0] > 1
        if(k <= 0) return arr[0] + k - 1;

        for(int i=0 ; i<arr.length-1 ; i++) {
            if(arr[i]+1 < arr[i+1]) {   //diff > 1
                k -= arr[i+1] - arr[i] - 1;
                if(k <= 0) return arr[i+1] + k - 1;
            }
        }
        return arr[arr.length-1] + k;
    }
}
