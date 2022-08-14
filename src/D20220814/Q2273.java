package D20220814;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2273. Find Resultant Array After Removing Anagrams
 */
public class Q2273 {

    public List<String> removeAnagrams1(String[] words) {

        List<String> result = new ArrayList<>();
        String prev = "";

        for(String word : words) {
            char[] array = word.toCharArray();
            Arrays.sort(array);
            String curr = String.valueOf(array);

            if(!prev.equals(curr)) {
                result.add(word);
                prev = curr;
            }
        }

        return result;
    }
}
