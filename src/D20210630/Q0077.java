package D20210630;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 77. Combinations
 */
public class Q0077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        getNum(new ArrayList<>(), result, 0, IntStream.range(1, n+1).toArray(), k);
        return result;
    }

    public void getNum(List<Integer> data, List<List<Integer>> result,
                       int index, int[] num, int k) {
        if(data.size() == k) result.add(new ArrayList<>(data));

        for(int i=index ; i<num.length ; i++) {
            data.add(num[i]);
            getNum(data, result, i+1, num, k);
            data.remove(data.size()-1);
        }
    }
}
