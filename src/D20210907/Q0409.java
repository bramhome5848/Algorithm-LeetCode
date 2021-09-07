package D20210907;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 409. Longest Palindrome
 */
public class Q0409 {

    public int longestPalindrome1(String s) {

        if(s.length() == 1) return 1;
        int result = 0;

        Map<Integer, Long> data = s.chars().boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        for(Long value : data.values()) {
            if(value % 2 == 0)  result += value;
            else result += value - 1;
        }

        //모두 짝수개가 아닌 경우 홀수로 남은 1개를 가운데에 이용 가능
        if(s.length() > result) result++;
        return result;
    }

    public int longestPalindrome2(String s) {

        if(s.length() == 1) return 1;
        int result = 0;

        Map<Character, Integer> data = new HashMap<>();
        for(char c : s.toCharArray()) {
           data.put(c, data.getOrDefault(c, 0) + 1);
        }

        for(int value : data.values()) {
            if(value % 2 == 0)  result += value;
            else result += value - 1;
        }

        //모두 짝수개가 아닌 경우 홀수로 남은 1개를 가운데에 이용 가능
        if(s.length() > result) result++;
        return result;
    }
}
