package D20220104;

import java.util.HashMap;
import java.util.Map;

/**
 * 1394. Find Lucky Integer in an Array
 */
public class Q1394 {

    public int findLucky(int[] arr) {

        Map<Integer, Integer> data = new HashMap<>();
        int result = 0;

        for(int value : arr) data.put(value, data.getOrDefault(value, 0)+1);

        for(Map.Entry<Integer, Integer> entry : data.entrySet()) {
            if(entry.getKey() == entry.getValue().intValue()) result = Math.max(result, entry.getKey());
        }

        return result == 0 ? -1 : result;
    }
}
