package D20210622;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. Letter Combinations of a Phone Number
 */
public class Q0017 {

    private static final Map<Character, char[]> keyMap = new HashMap<>();
    static {
        keyMap.put('2', new char[]{'a','b','c'});
        keyMap.put('3', new char[]{'d','e','f'});
        keyMap.put('4', new char[]{'g','h','i'});
        keyMap.put('5', new char[]{'j','k','l'});
        keyMap.put('6', new char[]{'m','n','o'});
        keyMap.put('7', new char[]{'p','q','r','s'});
        keyMap.put('8', new char[]{'t','u','v'});
        keyMap.put('9', new char[]{'w','x','y', 'z'});
    }

    public void backtrack(String digits, int index, List<String> result, StringBuilder sb) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        char[] data = keyMap.get(digits.charAt(index));
        for (char c : data) {
            sb.append(c);
            backtrack(digits, index+1, result, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        backtrack(digits, 0, result, new StringBuilder());
        return result;
    }
}
