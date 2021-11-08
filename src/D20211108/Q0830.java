package D20211108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Q0830 {

    public List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> result = new ArrayList<>();
        int idx = 0;

        for(int i=1 ; i<s.length() ; i++) {
            if(s.charAt(idx) != s.charAt(i)) {
                if(i-idx >= 3) result.add(Arrays.asList(idx, i-1));
                idx = i;
            }
        }
        if(s.length()-idx >= 3) result.add(Arrays.asList(idx, s.length() - 1));

        return result;
    }
}
