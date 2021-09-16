package D20210916;

import java.util.ArrayList;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 */
public class Q0438 {

    public List<Integer> findAnagrams(String s, String p) {

        if(s.length() < p.length()) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int[] freq = new int[26];
        int left = 0;
        int right = 0;

        for(char c : p.toCharArray()) freq[c - 'a']++;  //p의 count

        while (right < s.length()) {
            int c = s.charAt(right++) - 'a';    //s 문자의 index
            freq[c]--;  //문자 사용

            //길이가 이미 넘어간 경우 왼쪽부분은 복구
            while (right - left > p.length()) freq[s.charAt(left++) - 'a']++;

            //사용빈도가 0보다 작은 경우 left쪽의 문자로 복구
            while(freq[c] < 0) freq[s.charAt(left++) - 'a']++;

            if (right - left == p.length()) result.add(left);
        }

        return result;
    }
}
