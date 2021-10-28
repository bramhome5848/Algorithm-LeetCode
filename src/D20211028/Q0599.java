package D20211028;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 599. Minimum Index Sum of Two Lists
 */
public class Q0599 {

    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<list1.length ; i++) map.put(list1[i], i);
        for(int i=0 ; i<list2.length ; i++) {
            if(map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                min = Math.min(min, sum);
                map.put(list2[i], -sum);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
           if(entry.getValue() == -min) result.add(entry.getKey());
        }

        return result.toArray(String[]::new);
    }
}
