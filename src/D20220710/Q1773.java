package D20220710;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 1773. Count Items Matching a Rule
 */
public class Q1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = "type".equals(ruleKey) ? 0 : "color".equals(ruleKey) ? 1 : 2;
        return (int) items.stream().filter(s -> s.get(idx).equals(ruleValue)).count();
    }
}
