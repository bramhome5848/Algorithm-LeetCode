package D20211116;

import java.util.Stack;

/**
 * 1047. Remove All Adjacent Duplicates In String
 */
public class Q1047 {

    public String removeDuplicates(String s) {

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(result.length() == 0) result.append(c);
            else if(result.charAt(result.length()-1) == c) result.setLength(result.length()-1);
            else result.append(c);
        }

        return result.toString();
    }
}
