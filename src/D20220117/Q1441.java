package D20220117;

import java.util.ArrayList;
import java.util.List;

/**
 * 1441. Build an Array With Stack Operations
 */
public class Q1441 {

    public List<String> buildArray(int[] target, int n) {

        List<String> result = new ArrayList<>();

        int last = target[target.length-1];
        int idx = 0;

        for(int i=1 ; i<last+1 ; i++) {
            if(i == target[idx]) {
                result.add("Push");
                idx++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }

        return result;
    }
}
