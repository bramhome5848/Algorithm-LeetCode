package M20221121;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 */
public class Q0003 {

    //hint : two pointer
    //i -> 중복되는 경우가 생기지 않을 때 까지 i는 앞의 data 삭제
    //j -> 현재
    //a b c b
    //i   j     -> 3
    //  i j     -> 2
    //   ij     -> 1
    //    i j   -> 2
    public int lengthOfLongestSubstring(String s) {

        if(s.length() < 2) return s.length();

        int i = 0;
        int j = 0;
        int result = 1;

        Set<Character> set = new HashSet<>();
        set.add(s.charAt(j));

        while(j < s.length() - 1) {
            if(!set.contains(s.charAt(j + 1))) {
                set.add(s.charAt(j++ + 1));
                result = Math.max(result, j - i + 1);
                //result = Math.max(result, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return result;
    }
}
