package D20210626;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. Combination Sum
 */
public class Q0039 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        getResult(candidates, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    public void getResult(int[] candidates, int target, int sum,
                          int index, List<Integer> data, List<List<Integer>> result)  {

        if(sum == target) {
            result.add(new ArrayList<>(data));
            return;
        }

        for(int i=index ; i<candidates.length ; i++) {
            if(sum + candidates[i] <= target) {
                sum += candidates[i];
                data.add(candidates[i]);
                getResult(candidates, target, sum, i, data, result);
                sum -= candidates[i];
                data.remove(data.size()-1);
            }
        }
    }
}
