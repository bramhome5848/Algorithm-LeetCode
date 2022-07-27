package D20220727;

import java.util.*;

/**
 * 2103. Rings and Rods
 */
public class Q2103 {

    public int countPoints(String rings) {

        Map<Integer, Set<Character>> map = new HashMap<>();
        int result = 0;

        for(int i=0 ; i<rings.length() ; i+=2) {
            char color = rings.charAt(i);
            int num = rings.charAt(i+1) - '0';

            map.putIfAbsent(num, new HashSet<>());
            map.get(num).add(color);
        }

        for(Set<Character> set : map.values()) {
           if(set.size() == 3) result++;
        }

        return result;
    }
}
