package D20210818;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 345. Reverse Vowels of a String
 */
public class Q0345 {

    //5ms
    public String reverseVowels1(String s) {

        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] data = s.toCharArray();

        int left = 0;
        int right = data.length-1;

        while(left < right) {
            if(!set.contains(data[left])) left++;
            if(!set.contains(data[right])) right--;

            if(set.contains(data[left]) && set.contains(data[right])) {
                char temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }

        return new String(data);
    }

    //4ms
    public String reverseVowels2(String s) {

        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] data = s.toCharArray();

        int left = 0;
        int right = data.length-1;

        while(left < right) {

            while(left < right && !set.contains(data[left])) left++;
            while(left < right && !set.contains(data[right])) right--;

            if(left < right) {
                char temp = data[left];
                data[left] = data[right];
                data[right] = temp;
            }
            left++;
            right--;
        }
        return new String(data);
    }

    public String reverseVowels3(String ss) {

        char[] data = ss.toCharArray();
        int s = 0;
        int e = data.length-1;

        while(s < e) {

            while(s < e && (data[s]!='a' && data[s]!='e' && data[s]!='i' && data[s]!='o' && data[s]!='u'
                    &&  data[s]!='A' && data[s]!='E' && data[s]!='I' && data[s]!='O' && data[s]!='U')) s++;
            while(s < e && (data[e]!='a' && data[e]!='e' && data[e]!='i' && data[e]!='o' && data[e]!='u'
                    &&  data[e]!='A' && data[e]!='E' && data[e]!='I' && data[e]!='O' && data[e]!='U')) e--;

            if(s < e) {
                char temp = data[s];
                data[s] = data[e];
                data[e] = temp;
            }

            s++;
            e--;
        }

        return new String(data);
    }
}
