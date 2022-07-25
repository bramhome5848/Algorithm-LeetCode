package D20220725;

import java.util.HashSet;
import java.util.Set;

/**
 * 2062. Count Vowel Substrings of a String
 */
public class Q2062 {

    public int countVowelSubstrings(String word) {

        int result = 0;

        for(int i=0 ; i<word.length() ; i++) {
            Set<Character> set = new HashSet<>();

            for(int j=i ; j<word.length() ; j++) {
                if(!isVowel(word.charAt(j))) break;

                set.add(word.charAt(j));

                if(set.size() == 5) result++;
            }
        }

        return result;
    }

    private boolean isVowel(char c) {
        return c == 'a'|| c == 'e'|| c == 'i' || c == 'o' || c == 'u';
    }
}
