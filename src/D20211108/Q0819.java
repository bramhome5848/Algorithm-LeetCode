package D20211108;

import java.util.*;

/**
 * 819. Most Common Word
 */
public class Q0819 {

    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> set = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.toLowerCase().split("\\W+");
        Map<String, Integer> map = new HashMap<>();

        int count = 0;
        String result = "";

        for(String word : words) {
            if(set.contains(word)) continue;

            map.put(word, map.getOrDefault(word, 0) + 1);
            if(count < map.get(word)) {
                count = map.get(word);
                result = word;
            }
        }

        return result;
    }
}
