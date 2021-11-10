package D20211110;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 914. X of a Kind in a Deck of Cards
 */
public class Q0914 {

    public boolean hasGroupsSizeX(int[] deck) {

        int min = deck.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int j : deck) map.put(j, map.getOrDefault(j, 0) + 1);
        for(int value : map.values()) min = Math.min(min, value);
        for(int value : map.values()) {
            min = getGcd(min, value);
            if(min == 1) return false;
        }

        return true;
    }

    private int getGcd(int a, int b) {
        if(b == 0) return a;
        return getGcd(b, a%b);
    }
}
