package D20211119;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1207. Unique Number of Occurrences
 */
public class Q1207 {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0 ; i<arr.length ; i++) {
            if(map.containsKey(arr[i])) continue;

            for(int j=i+1 ; j<arr.length ; j++) {
                if(arr[i] == arr[j]) count++;
            }

            if(map.containsValue(count)) return false;

            map.put(arr[i], count);
            count = 0;
        }
        return true;
    }
}
