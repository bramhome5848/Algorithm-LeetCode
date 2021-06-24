package D20210624;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 */
public class Q0022 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solution(n, n, 0, new char[n * 2], result);
        return result;
    }

    public void solution(int open, int close, int idx, char[] data, List<String> result) {

        if(close < open) return;

        if(open == 0 && close  == 0) {
            result.add(new String(data));
        }

        if(open > 0)  {
            data[idx] = '(';
            solution(open - 1, close, idx+1, data, result);
        }

        if(close > 0) {
            data[idx] = ')';
            solution(open, close - 1, idx+1, data, result);
        }
    }
}
