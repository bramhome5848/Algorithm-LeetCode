package D20220718;

import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * 1941. Check if All Characters Have Equal Number of Occurrences
 */
public class Q1941 {

    public boolean areOccurrencesEqual(String s) {

        return new HashSet<>(s.chars().boxed()
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()))
                .values()).size() <= 1;
    }
}
