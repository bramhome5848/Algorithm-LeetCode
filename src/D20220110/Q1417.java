package D20220110;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 1417. Reformat The String
 */
public class Q1417 {

    public String reformat(String s) {

        List<Character> digit = new ArrayList<>();
        List<Character> letter = new ArrayList<>();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) digit.add(c);
            else letter.add(c);
        }

        if(Math.abs(digit.size() - letter.size()) > 1) return "";
        if(digit.size() >= letter.size()) return getResult(digit, letter);

        return getResult(letter, digit);
    }

    private String getResult(List<Character> l1, List<Character> l2) {
        StringBuilder result = new StringBuilder();

        for(int i=0 ; i<l1.size() ; i++){
            result.append(l1.get(i));
            if(i < l2.size()) result.append(l2.get(i));
        }

        return result.toString();
    }
}
