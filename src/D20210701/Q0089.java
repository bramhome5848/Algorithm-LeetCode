package D20210701;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 89. Gray Code
 */
public class Q0089 {

    //n bit -> 2^n
    public List<Integer> grayCode(int n) {

        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);

        //(00, 01) -> add (11, 10)
        //01 | 10 -> 11
        //00 | 10 -> 10
        //(000, 001, 011, 010) -> add (110, 111, 101, 100)
        //010 | 100 -> 110
        //011 | 100 -> 111
        //101 | 100 -> 101
        //100 | 100 -> 100
        for(int i=2 ; i<n+1 ; i++) {
            int mask = 1 << (i-1);
            for(int j=result.size()-1 ; j>-1 ; j--) {
                result.add(mask | result.get(j));
            }
        }
        return result;
    }
}
