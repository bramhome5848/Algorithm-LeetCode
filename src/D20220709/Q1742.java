package D20220709;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1742. Maximum Number of Balls in a Box
 */
public class Q1742 {

    public int countBalls1(int lowLimit, int highLimit) {
        int[] result = IntStream.range(lowLimit, highLimit + 1).map(this::getSum).toArray();
        Map<Integer, Long> map = Arrays.stream(result).boxed().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        return map.values().stream().max((m1, m2) -> (int) (m1 - m2)).orElse(0L).intValue();
    }

    public int countBalls2(int lowLimit, int highLimit) {
        return IntStream.range(lowLimit, highLimit + 1)
                .map(this::getSum).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .values().stream()
                .max((m1, m2) -> (int) (m1 - m2)).orElse(0L).intValue();
    }

    private int getSum(int num) {

        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
