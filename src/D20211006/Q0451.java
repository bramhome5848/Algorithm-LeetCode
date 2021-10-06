package D20211006;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 451. Sort Characters By Frequency
 */
public class Q0451 {

    public String frequencySort(String s) {

        Map<Character, Integer> data = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            data.put(c, data.getOrDefault(c, 0) + 1);
        }

        List<Pair> list = data.entrySet()
                .stream()
                .map(e -> new Pair(e.getKey(), e.getValue()))
                .sorted((l1, l2) -> l1.count == l2.count ? l1.c - l2.c : l2.count - l1.count)
                .collect(Collectors.toList());

        for(Pair pair : list) {
            int count = pair.count;
            sb.append(String.valueOf(pair.c).repeat(Math.max(0, count)));
        }

        return sb.toString();
    }

    public static class Pair {
        char c;
        int count;

        public Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

}
