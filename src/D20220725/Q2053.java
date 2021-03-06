package D20220725;

import java.util.HashMap;
import java.util.Map;

/**
 * 2053. Kth Distinct String in an Array
 */
public class Q2053 {

    public String kthDistinct(String[] arr, int k) {

        Map<String, Integer> map = new HashMap<>();

        for(String s : arr) map.put(s, map.getOrDefault(s, 0) + 1);
        for(String s : arr) if (map.get(s) == 1 && --k == 0 ) return s ;

        return "";
    }
}
