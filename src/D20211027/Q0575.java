package D20211027;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 575. Distribute Candies
 */
public class Q0575 {

    public int distributeCandies1(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int val : candyType) set.add(val);
        return Math.min(set.size(), candyType.length/2);
    }

    public int distributeCandies2(int[] candyType) {
        Set<Integer> set = Arrays.stream(candyType).boxed().collect(Collectors.toSet());
        return Math.min(set.size(), candyType.length/2);
    }
}
