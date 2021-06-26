package D20210626;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. Combination Sum II
 */
public class Q0040 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        getResult(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public void getResult(int[] candidates, int target,
                                 int index, List<Integer> data, List<List<Integer>> result)  {

        if(target == 0) {
            result.add(new ArrayList<>(data));
            return;
        }

        //같은 레벨에서 이전에 선택했던 값을 선택하지 않기 위해
        int prev = -1;
        for(int i=index ; i<candidates.length ; i++) {
            if(prev != candidates[i] && target - candidates[i] >= 0) {
                data.add(candidates[i]);
                getResult(candidates, target - candidates[i], i+1, data, result);
                data.remove(data.size()-1);
                prev = candidates[i];
            }
        }
    }
}
