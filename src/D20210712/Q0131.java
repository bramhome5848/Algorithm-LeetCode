package D20210712;

import java.util.ArrayList;
import java.util.List;

/**
 * 131. Palindrome Partitioning
 */
public class Q0131 {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        generatePart(s, new ArrayList<>(), result);
        return result;
    }

    private void generatePart(String s, List<String> subResult, List<List<String>> result) {

        if(s.length() == 0) {
            result.add(new ArrayList<>(subResult));
            return;
        }

        for(int i=1 ; i<s.length()+1 ; i++) {
            if(isValid(s, i)) {
                subResult.add(s.substring(0, i));
                generatePart(s.substring(i), subResult, result);
                subResult.remove(subResult.size()-1);
            }
        }
    }

    private boolean isValid(String data, int length) {
        int left = 0;
        int right = length - 1;
        while (left < right) {
            if (data.charAt(left) == data.charAt(right)) {
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
