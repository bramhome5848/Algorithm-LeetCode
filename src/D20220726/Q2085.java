package D20220726;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2085. Count Common Words With One Occurrence
 */
public class Q2085 {

    public int countWords(String[] words1, String[] words2) {

        int result = 0;

        Map<String, Long> map1 = Arrays.stream(words1)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        Map<String, Long> map2 = Arrays.stream(words2)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        for(String word : words1) {
            if(map1.get(word) == 1 && map2.getOrDefault(word, 0L) == 1) result++;
        }

        return result;
    }
}
