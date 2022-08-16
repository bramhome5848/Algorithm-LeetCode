package D20220816;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2347. Best Poker Hand
 */
public class Q2347 {

    public String bestHand(int[] ranks, char[] suits) {

        if(suits[0] == suits[1] && suits[1] == suits[2] && suits[2] == suits[3]
                && suits[3] == suits[4]) return "Flush";

        Map<Integer, Long> map = Arrays.stream(ranks).boxed()
                .collect(Collectors.groupingBy(r -> r, Collectors.counting()));

        if(map.size() <= 2 || map.containsValue(3L)) return "Three of a Kind";
        if(map.size() == 5) return "High Card";

        return "Pair";
    }
}
