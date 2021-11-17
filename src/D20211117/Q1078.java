package D20211117;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078. Occurrences After Bigram
 */
public class Q1078 {

    public String[] findOcurrences(String text, String first, String second) {

        List<String> result = new ArrayList<>();
        String[] data = text.split(" ");

        for(int i=0 ; i<data.length-2 ; i++) {
            if(data[i].equals(first) && data[i+1].equals(second)) result.add(data[i+2]);
        }

        return result.toArray(String[]::new);
    }
}
