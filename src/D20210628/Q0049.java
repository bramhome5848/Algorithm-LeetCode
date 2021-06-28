package D20210628;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 49. Group Anagrams
 */
public class Q0049 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> data = new HashMap<>();

        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!data.containsKey(key)) {
                data.put(key, new ArrayList<>());
            }
            data.get(key).add(s);
        }

        return new ArrayList<>(data.values());
    }
}
