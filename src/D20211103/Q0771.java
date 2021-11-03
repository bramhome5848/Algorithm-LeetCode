package D20211103;

import java.util.HashSet;
import java.util.Set;

/**
 * 771. Jewels and Stones
 */
public class Q0771 {

    public int numJewelsInStones1(String jewels, String stones) {

        Set<Character> set = new HashSet<>();
        int count = 0;

        for(char c : jewels.toCharArray()) set.add(c);
        for(char c : stones.toCharArray()) {
           if(set.contains(c)) count++;
        }

        return count;
    }

    public int numJewelsInStones2(String jewels, String stones) {

        int count = 0;

        for(char j : jewels.toCharArray()) {
            for(char s : stones.toCharArray()) {
               if(j == s) count++;
            }
        }

        return count;
    }
}
