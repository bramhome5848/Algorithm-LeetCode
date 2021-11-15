package D20211115;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 */
public class Q1002 {

    public List<String> commonChars(String[] words) {

        List<int[]> countList = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for(String word : words) {
            int[] freq = new int[26];
            for(char c : word.toCharArray()) freq[c-'a']++;
            countList.add(freq);
        }

        for(int i=0 ; i<26 ; i++) {
            int count = Integer.MAX_VALUE;

            for(int[] freq : countList) count = Math.min(count, freq[i]);
            for(int j=0 ; j<count ; j++) result.add(String.valueOf((char)(i+'a')));
        }

        return result;
    }
}
