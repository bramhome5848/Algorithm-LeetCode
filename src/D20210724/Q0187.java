package D20210724;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 187. Repeated DNA Sequences
 */
public class Q0187 {

    public List<String> findRepeatedDnaSequences(String s) {

        Map<String, Integer> map = new HashMap<>();

        for(int i=0 ; i<s.length()-9 ; i++) {
            String key = s.substring(i, i+10);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return map.entrySet().stream().filter(m -> m.getValue() > 1).
                map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
