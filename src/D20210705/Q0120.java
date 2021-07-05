package D20210705;

import java.util.Comparator;
import java.util.List;

/**
 * 120. Triangle
 */
public class Q0120 {

    public int minimumTotal(List<List<Integer>> triangle) {

        for(int i=1 ; i<triangle.size() ; i++) {
            List<Integer> prev = triangle.get(i-1);
            List<Integer> sub = triangle.get(i);

            //index - 0
            sub.set(0, sub.get(0) + prev.get(0));

            for(int j=1 ; j<sub.size()-1 ; j++) {
                sub.set(j, sub.get(j) + Math.min(prev.get(j-1), prev.get(j)));
            }

            //index - last
            sub.set(sub.size()-1, sub.get(sub.size()-1) + prev.get(prev.size()-1));
        }

        return triangle.get(triangle.size() - 1).stream().min(Comparator.comparingInt(s -> s)).get();
    }
}
