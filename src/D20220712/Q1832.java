package D20220712;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1832. Check if the Sentence Is Pangram
 */
public class Q1832 {

    public boolean checkIfPangram1(String sentence) {

        int[] freq = new int[26];
        for(char c : sentence.toCharArray()) freq[c-'a']++;

        for(int value : freq) {
           if(value == 0) return false;
        }

        return true;
    }

    public boolean checkIfPangram2(String sentence) {

        Set<Character> set = new HashSet<>();
        for(char c : sentence.toCharArray()) set.add(c);

        return set.size() == 26;
    }
}
