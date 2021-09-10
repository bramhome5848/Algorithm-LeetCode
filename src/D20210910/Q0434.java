package D20210910;

import java.util.Arrays;

/**
 * 434. Number of Segments in a String
 */
public class Q0434 {

    public int countSegments(String s) {
        return (int) Arrays.stream(s.split(" "))
                .map(String::trim)
                .filter(c -> !"".equals(c))
                .count();
    }
}
