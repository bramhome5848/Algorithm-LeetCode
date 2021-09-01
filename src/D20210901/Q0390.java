package D20210901;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 390. Elimination Game
 */
public class Q0390 {

    public int lastRemaining(int n) {
        if (n == 1) return 1;
        return 2 * (n/2 + 1 - lastRemaining(n / 2));
    }
}
