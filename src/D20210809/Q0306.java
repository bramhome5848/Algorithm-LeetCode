package D20210809;

import java.util.ArrayList;
import java.util.List;

/**
 * 306. Additive Number
 */
public class Q0306 {

    public boolean isAdditiveNumber(String num) {
        return backtrack(num, new ArrayList<>(), 0);
    }

    private boolean backtrack(String num, List<String> result, int idx) {

        if(idx == num.length()) {
            return result.size() >= 3;
        }

        for(int i=idx ; i<num.length() ; i++) {
            if(num.charAt(idx) == '0' && i>idx) return false;   //leading zero

            String next = num.substring(idx, i+1);
            if(result.size() >= 2 && !isValid(result.get(result.size()-2), result.get(result.size()-1), next)) continue;

            result.add(next);
            if (backtrack(num, result, i+1)) return true;
            result.remove(result.size() - 1);
        }
        return false;
    }

    private boolean isValid(String num1, String num2, String sum) {

        int value1 = num1.length();
        int value2 = num2.length();
        int valueS = sum.length();

        if(value1 > valueS || value2 > valueS) return false;
        int carry = 0;

        for(int i=1 ; i<valueS+1 ; i++) {
            int d1 = value1-i >= 0 ? (num1.charAt(value1-i) - '0') : 0;
            int d2 = value2-i >= 0 ? (num2.charAt(value2-i) - '0') : 0;
            if ((d1 + d2 + carry) % 10 != (sum.charAt(valueS-i) - '0')) return false;

            carry = (d1+d2+carry) / 10;
        }

        return carry == 0;
    }
}
