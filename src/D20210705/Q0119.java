package D20210705;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 */
public class Q0119 {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();
        long num = 1;

        for(int i=0 ; i<rowIndex+1 ; i++) {
            result.add(Math.toIntExact(num));   //long -> int
            num = num * (rowIndex-i) / (i+1);
        }
        return result;
    }
}
