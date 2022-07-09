package D20220709;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1725. Number Of Rectangles That Can Form The Largest Square
 */
public class Q1725 {

    public int countGoodRectangles(int[][] rectangles) {

        List<Integer> lengthList = Arrays.stream(rectangles)
                .map(s -> Math.min(s[0], s[1]))
                .collect(Collectors.toList());

        int max = lengthList.stream().max(Comparator.comparingInt(l -> l)).orElse(0);
        return (int) lengthList.stream().filter(s -> s == max).count();
    }
}
