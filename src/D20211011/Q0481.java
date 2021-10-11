package D20211011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 481. Magical String
 */
public class Q0481 {

    public int magicalString(int n) {

        List<Integer> data = new ArrayList<>(Arrays.asList(1, -1, -1));
        int key = 1;

        for(int i=2 ; i<n ; i++) {
            if(data.get(i) == 1) data.add(key);
            if(data.get(i) == -1) {
                data.add(key);
                data.add(key);
            }
            key *= -1;
        }

        return (int) data.stream().limit(n).filter(s -> s==1).count();
    }
}
