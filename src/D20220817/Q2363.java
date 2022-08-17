package D20220817;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 2363. Merge Similar Items
 */
public class Q2363 {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int[] items : items1) {
           map.put(items[0], map.getOrDefault(items[0], 0) + items[1]);
        }

        for(int[] items : items2) {
            map.put(items[0], map.getOrDefault(items[0], 0) + items[1]);
        }

        return map.entrySet().stream()
                .map(s -> List.of(s.getKey(), s.getValue()))
                .sorted(Comparator.comparingInt(l -> l.get(0)))
                .collect(Collectors.toList());
    }
}
