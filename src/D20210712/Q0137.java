package D20210712;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 137. Single Number II
 */
public class Q0137 {

    //같은 것 3번, 다른건 1번
    public int singleNumber(int[] nums) {

        Map<Integer, Long> result = Arrays.stream(nums).boxed().
                collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        for (Map.Entry<Integer, Long> entry : result.entrySet()) {
            if(entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }
}
