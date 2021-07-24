package D20210724;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 179. Largest Number
 */
public class Q0179 {

    public String largestNumber(int[] nums) {
        if(nums.length == 0) return "";

        String result = Arrays.stream(nums).mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2+s1).compareTo(s1+s2)).collect(Collectors.joining());

        if(result.charAt(0) == '0') return "0";
        return result;

    }
}
