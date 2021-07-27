package D20210727;

import java.util.ArrayList;
import java.util.List;

/**
 * 216. Combination Sum III
 */
public class Q0216 {

    public List<List<Integer>> combinationSum3(int k, int n) {

        if(n < k) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        getResult(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void getResult(int start, int k , int n,
                          List<Integer> sub, List<List<Integer>> result) {
        if(k<0 || n<0) return;
        if(k==0 && n==0) result.add(new ArrayList<>(sub));

        for(int i=start ; i<10 ; i++) {
            sub.add(i);
            getResult(i+1, k-1, n-i, sub, result);
            sub.remove(sub.size() - 1);
        }
    }
}
