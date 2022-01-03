package D20220103;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1370. Increasing Decreasing String
 */
public class Q1370 {

    public String sortString(String s) {

        int[] data = new int[26];
        int size = 0;
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) data[c-'a']++;

        while(size < s.length()) {
            for(int i=0 ; i<data.length ; i++) {
                if(data[i] > 0) {
                    result.append((char)(i+'a'));
                    data[i]--;
                    size++;
                }
            }

            for(int i=data.length-1 ; i>-1 ; i--) {
                if(data[i] > 0) {
                    result.append((char)(i+'a'));
                    data[i]--;
                    size++;
                }
            }
        }

        return result.toString();
    }
}
