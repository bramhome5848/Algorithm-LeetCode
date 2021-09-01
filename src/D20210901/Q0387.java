package D20210901;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 387. First Unique Character in a String
 */
public class Q0387 {

    public int firstUniqChar1(String s) {

        int[] countFreq = new int[26];

        for(char c : s.toCharArray()) countFreq[c - 'a']++;
        for(int i=0 ; i<s.length() ; i++){
            if(countFreq[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;
    }

    public int firstUniqChar2(String s) {

        int result = s.length();

        List<Integer> keySet = s.chars().boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if(keySet.size() == 0) return -1;

        for(Integer key : keySet) {
           result = Math.min(result, s.lastIndexOf(key));
        }

        return result;
    }
}
