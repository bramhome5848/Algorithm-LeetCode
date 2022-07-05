package D22020705;

import java.util.HashMap;
import java.util.Map;

/**
 * 1640. Check Array Formation Through Concatenation
 */
public class Q1640 {

    public boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer, int[]> map = new HashMap<>();
        int idx = 0;

        for(int[] piece : pieces) {
            map.put(piece[0], piece);
        }

        while(idx < arr.length) {
            if(!map.containsKey(arr[idx])) return false;

            for(int value : map.get(arr[idx])) {
                if(value != arr[idx++]) return false;
            }
        }

        return true;
    }
}
