package D20220713;

import java.util.Map;
import java.util.TreeMap;

/**
 * 1859. Sorting the Sentence
 */
public class Q1859 {

    public String sortSentence(String s) {

        TreeMap<Integer, String> map = new TreeMap<>();
        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");

        for(String str : arr) {
            map.put(str.charAt(str.length() - 1) - '0', str.substring(0, str.length() - 1));
        }

        for(String value : map.values()) {
           result.append(value).append(' ');
        }

        return result.deleteCharAt(result.length() - 1).toString();
    }
}
