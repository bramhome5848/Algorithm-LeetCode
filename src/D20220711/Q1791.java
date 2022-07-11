package D20220711;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1791. Find Center of Star Graph
 */
public class Q1791 {

    public int findCenter1(int[][] edges) {

        return Arrays.stream(edges)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingInt(m -> m.getValue().intValue()))
                .map(Map.Entry::getKey).orElse(0);
    }

    public int findCenter2(int[][] edges) {
        return (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) ? edges[0][0] : edges[0][1];
    }
}
