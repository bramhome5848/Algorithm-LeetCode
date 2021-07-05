package D20210705;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *  118. Pascal's Triangle
 */
public class Q0118 {

    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for(int i=1 ; i<numRows ; i++) {
            List<Integer> subR = new ArrayList<>();
            subR.add(1);
            for(int j=1 ; j<i ; j++) {
                subR.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            subR.add(1);
            result.add(subR);
        }

        return result;
    }
}
