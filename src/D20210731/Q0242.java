package D20210731;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 */
public class Q0242 {

    public static boolean isAnagram1(String s, String t) {

        Map<Integer, Integer> dataS = new LinkedHashMap<>();
        Map<Integer, Integer> dataT = new LinkedHashMap<>();

        for(char c : s.toCharArray()) {
            dataS.put(c-'a', dataS.getOrDefault(c-'a', 0)+1);
        }
        for(char c : t.toCharArray()) {
            dataT.put(c-'a', dataT.getOrDefault(c-'a', 0)+1);
        }

        if(dataS.size() != dataT.size()) return false;
        for (int key : dataS.keySet()) {
            if(!dataS.get(key).equals(dataT.get(key))) return false;
        }

        return true;
    }

    public static boolean isAnagram2(String s, String t) {

        int[] dataS = new int[26];
        int[] dataT = new int[26];

        for(char c : s.toCharArray()) dataS[c-'a']++;
        for(char c : t.toCharArray()) dataT[c-'a']++;

        for(int i=0 ; i<26 ; i++) {
            if(dataS[i] != dataT[i]) return false;
        }

        return true;
    }
}
