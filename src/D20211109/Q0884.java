package D20211109;

import java.util.*;

/**
 * 884. Uncommon Words from Two Sentences
 */
public class Q0884 {

    public String[] uncommonFromSentences(String s1, String s2) {

        Set<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        String[] data1 = s1.split(" ");
        String[] data2 = s2.split(" ");

        for(String s : data1) {
           if(set.contains(s)) result.add(s);
           else set.add(s);
        }

        for(String s : data2) {
            if(set.contains(s)) result.add(s);
            else set.add(s);
        }

        for(String s : result) set.remove(s);
        return set.toArray(String[]::new);
    }
}
