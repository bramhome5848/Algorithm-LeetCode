package D20220706;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1656. Design an Ordered Stream
 */
public class Q1656 {
}

class OrderedStream {

    private String[] stream;
    private Integer ptr;

    public OrderedStream(int n) {
        stream = new String[n+1];
        ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        stream[idKey] = value;
        List<String> result = new ArrayList<>();

        while(ptr < stream.length) {
            if(stream[ptr] == null) break;

            result.add(stream[ptr++]);
        }

        return result;
    }

}
