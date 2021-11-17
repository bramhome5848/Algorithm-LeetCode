package D20211117;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1122. Relative Sort Array
 */
public class Q1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] freq = new int[1001];
        int[] result = new int[arr1.length];
        int idx = 0;

        for(int value : arr1) freq[value]++;
        for(int value : arr2) {
            while(freq[value]-- > 0) result[idx++] = value;
        }

        for(int i=0 ; i<1001 ; i++){
            for(int j=0 ; j<freq[i] ; j++){
                result[idx++] = i;
            }
        }

        return result;
    }
}
